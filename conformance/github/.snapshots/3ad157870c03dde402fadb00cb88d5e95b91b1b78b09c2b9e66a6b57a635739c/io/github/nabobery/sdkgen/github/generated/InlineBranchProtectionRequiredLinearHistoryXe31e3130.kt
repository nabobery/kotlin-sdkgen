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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/required_linear_history.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/required_linear_history
 */
@Serializable(with = InlineBranchProtectionRequiredLinearHistoryXe31e3130.Serializer::class)
public class InlineBranchProtectionRequiredLinearHistoryXe31e3130(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineBranchProtectionRequiredLinearHistoryXe31e3130 = InlineBranchProtectionRequiredLinearHistoryXe31e3130(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBranchProtectionRequiredLinearHistoryXe31e3130 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBranchProtectionRequiredLinearHistoryXe31e3130> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBranchProtectionRequiredLinearHistoryXe31e3130 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBranchProtectionRequiredLinearHistoryXe31e3130")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBranchProtectionRequiredLinearHistoryXe31e3130 must be a JSON object")
      return InlineBranchProtectionRequiredLinearHistoryXe31e3130(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBranchProtectionRequiredLinearHistoryXe31e3130) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBranchProtectionRequiredLinearHistoryXe31e3130")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBranchProtectionRequiredLinearHistoryXe31e3130(block: InlineBranchProtectionRequiredLinearHistoryXe31e3130.Builder.() -> Unit): InlineBranchProtectionRequiredLinearHistoryXe31e3130 = InlineBranchProtectionRequiredLinearHistoryXe31e3130.build(block)
