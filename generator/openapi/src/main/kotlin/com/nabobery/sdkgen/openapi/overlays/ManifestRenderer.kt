package com.nabobery.sdkgen.openapi.overlays

internal object ManifestRenderer {
    fun render(overlays: List<AppliedOverlay>): String {
        val root = DocumentCodec.objectNode()
        root.put("schemaVersion", "phase0-overlay-manifest-v1")
        val entries = DocumentCodec.arrayNode()
        overlays.forEachIndexed { index, overlay ->
            val entry = DocumentCodec.objectNode()
            entry.put("order", index)
            entry.put("identity", overlay.identity)
            entry.put("title", overlay.title)
            entry.put("version", overlay.version)
            entry.put("sha256", overlay.sha256)
            entry.put("actionCount", overlay.actionCount)
            entries.add(entry)
        }
        root.set<com.fasterxml.jackson.databind.JsonNode>("overlays", entries)
        return DocumentCodec.prettyJson(root)
    }
}
