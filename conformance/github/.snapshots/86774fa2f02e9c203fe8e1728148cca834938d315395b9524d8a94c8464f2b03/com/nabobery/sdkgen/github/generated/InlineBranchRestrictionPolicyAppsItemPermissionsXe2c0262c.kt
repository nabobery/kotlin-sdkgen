package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/branch-restriction-policy/properties/apps/items/properties/permissio
 * ns.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/branch-restriction-policy/properties/apps/items/properties/permissio
 * ns
 */
@Serializable(with = InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c.Serializer::class)
public class InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c(
  public val contents: String? = null,
  public val issues: String? = null,
  public val metadata: String? = null,
  public val singleFile: String? = null,
) {
  public class Builder {
    public var contents: String? = null

    public var issues: String? = null

    public var metadata: String? = null

    public var singleFile: String? = null

    public fun build(): InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c = InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c(
      contents = contents,
      issues = issues,
      metadata = metadata,
      singleFile = singleFile,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c must be a JSON object")
      return InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c(
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<String>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<String>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.contents?.let { put("contents", it) }
        value.issues?.let { put("issues", it) }
        value.metadata?.let { put("metadata", it) }
        value.singleFile?.let { put("single_file", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c(block: InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c.Builder.() -> Unit): InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c = InlineBranchRestrictionPolicyAppsItemPermissionsXe2c0262c.build(block)
