package com.vicmatskiv.weaponlib;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.vicmatskiv.weaponlib.compatibility.CompatibleResourcePack;

import net.minecraft.util.ResourceLocation;

public class WeaponResourcePack extends CompatibleResourcePack {
	
	private static final String WEAPONLIB_RESOURCE_DOMAIN = "weaponlib";
	
	private static final Set<String> RESOURCE_DOMAINS = Collections.unmodifiableSet(new HashSet<>(
			Collections.singleton(WEAPONLIB_RESOURCE_DOMAIN)));

	@Override
	public InputStream getInputStream(ResourceLocation resourceLocation) throws IOException {
	    String resourcePath = modifyResourcePath(resourceLocation);
		return getClass().getResourceAsStream(resourcePath);
	}

    private String modifyResourcePath(ResourceLocation resourceLocation) {
        String resourcePath = resourceLocation.getResourcePath();
        if(resourcePath.startsWith("textures")) {
            int lastIndexOfSlash = resourcePath.lastIndexOf('/');
            if(lastIndexOfSlash >= 0) {
                String fileName = resourcePath.substring(lastIndexOfSlash + 1);
                resourcePath = '/' + getClass().getPackage().getName().replace('.', '/') + "/resources/" + fileName;
            }
        }
        return resourcePath;
    }

	@Override
	public boolean resourceExists(ResourceLocation resourceLocation) {
	    String resourcePath = modifyResourcePath(resourceLocation);
        boolean value = WEAPONLIB_RESOURCE_DOMAIN.equals(resourceLocation.getResourceDomain())
				&& getClass().getResource(resourcePath) != null;
		return value;
	}

	@Override
	public Set<String> getCompatibleResourceDomains() {
		return RESOURCE_DOMAINS;
	}

	@Override
	public BufferedImage getPackImage() throws IOException {
		return null;
	}

	@Override
	public String getPackName() {
		return getClass().getSimpleName();
	}
}
