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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/block_creations.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/block_creations
 */
@Serializable(with = InlineBranchProtectionBlockCreationsX43b33180.Serializer::class)
public class InlineBranchProtectionBlockCreationsX43b33180(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineBranchProtectionBlockCreationsX43b33180 = InlineBranchProtectionBlockCreationsX43b33180(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBranchProtectionBlockCreationsX43b33180 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBranchProtectionBlockCreationsX43b33180> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBranchProtectionBlockCreationsX43b33180 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBranchProtectionBlockCreationsX43b33180")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBranchProtectionBlockCreationsX43b33180 must be a JSON object")
      return InlineBranchProtectionBlockCreationsX43b33180(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBranchProtectionBlockCreationsX43b33180) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBranchProtectionBlockCreationsX43b33180")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBranchProtectionBlockCreationsX43b33180(block: InlineBranchProtectionBlockCreationsX43b33180.Builder.() -> Unit): InlineBranchProtectionBlockCreationsX43b33180 = InlineBranchProtectionBlockCreationsX43b33180.build(block)
