package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/allow_deletions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/allow_deletions
 */
@Serializable(with = InlineBranchProtectionAllowDeletionsXfef7a233.Serializer::class)
public class InlineBranchProtectionAllowDeletionsXfef7a233(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineBranchProtectionAllowDeletionsXfef7a233 = InlineBranchProtectionAllowDeletionsXfef7a233(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBranchProtectionAllowDeletionsXfef7a233 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBranchProtectionAllowDeletionsXfef7a233> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBranchProtectionAllowDeletionsXfef7a233 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBranchProtectionAllowDeletionsXfef7a233")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBranchProtectionAllowDeletionsXfef7a233 must be a JSON object")
      return InlineBranchProtectionAllowDeletionsXfef7a233(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBranchProtectionAllowDeletionsXfef7a233) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBranchProtectionAllowDeletionsXfef7a233")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBranchProtectionAllowDeletionsXfef7a233(block: InlineBranchProtectionAllowDeletionsXfef7a233.Builder.() -> Unit): InlineBranchProtectionAllowDeletionsXfef7a233 = InlineBranchProtectionAllowDeletionsXfef7a233.build(block)
