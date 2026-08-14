package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/required_linear_history.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/required_linear_history
 */
@Serializable(with = InlineProtectedBranchRequiredLinearHistoryXac821782.Serializer::class)
public class InlineProtectedBranchRequiredLinearHistoryXac821782(
  public val enabled: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): InlineProtectedBranchRequiredLinearHistoryXac821782 {
      check(enabledValue != null) { "enabled is required" }
      return InlineProtectedBranchRequiredLinearHistoryXac821782(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProtectedBranchRequiredLinearHistoryXac821782 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProtectedBranchRequiredLinearHistoryXac821782> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProtectedBranchRequiredLinearHistoryXac821782 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProtectedBranchRequiredLinearHistoryXac821782")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProtectedBranchRequiredLinearHistoryXac821782 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineProtectedBranchRequiredLinearHistoryXac821782(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProtectedBranchRequiredLinearHistoryXac821782) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProtectedBranchRequiredLinearHistoryXac821782")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProtectedBranchRequiredLinearHistoryXac821782(block: InlineProtectedBranchRequiredLinearHistoryXac821782.Builder.() -> Unit): InlineProtectedBranchRequiredLinearHistoryXac821782 = InlineProtectedBranchRequiredLinearHistoryXac821782.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProtectedBranchRequiredLinearHistoryXac821782 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
