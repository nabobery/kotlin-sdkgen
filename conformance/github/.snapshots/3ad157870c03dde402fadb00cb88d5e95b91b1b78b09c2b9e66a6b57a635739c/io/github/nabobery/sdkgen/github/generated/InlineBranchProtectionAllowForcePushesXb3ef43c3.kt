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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/allow_force_pushes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/allow_force_pushes
 */
@Serializable(with = InlineBranchProtectionAllowForcePushesXb3ef43c3.Serializer::class)
public class InlineBranchProtectionAllowForcePushesXb3ef43c3(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineBranchProtectionAllowForcePushesXb3ef43c3 = InlineBranchProtectionAllowForcePushesXb3ef43c3(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBranchProtectionAllowForcePushesXb3ef43c3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBranchProtectionAllowForcePushesXb3ef43c3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBranchProtectionAllowForcePushesXb3ef43c3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBranchProtectionAllowForcePushesXb3ef43c3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBranchProtectionAllowForcePushesXb3ef43c3 must be a JSON object")
      return InlineBranchProtectionAllowForcePushesXb3ef43c3(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBranchProtectionAllowForcePushesXb3ef43c3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBranchProtectionAllowForcePushesXb3ef43c3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBranchProtectionAllowForcePushesXb3ef43c3(block: InlineBranchProtectionAllowForcePushesXb3ef43c3.Builder.() -> Unit): InlineBranchProtectionAllowForcePushesXb3ef43c3 = InlineBranchProtectionAllowForcePushesXb3ef43c3.build(block)
