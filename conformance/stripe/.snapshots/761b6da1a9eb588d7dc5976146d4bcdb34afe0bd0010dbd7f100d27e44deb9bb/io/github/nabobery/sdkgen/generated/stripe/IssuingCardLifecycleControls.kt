package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class IssuingCardLifecycleControlsView(
  @SerialName("cancel_after")
  public val cancelAfter: IssuingCardLifecycleConditions,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_lifecycle_controls
 */
@Serializable(with = IssuingCardLifecycleControls.Serializer::class)
public class IssuingCardLifecycleControls(
  public val cancelAfter: IssuingCardLifecycleConditions,
) {
  public class Builder {
    private var cancelAfterValue: IssuingCardLifecycleConditions? = null

    public var cancelAfter: IssuingCardLifecycleConditions
      get() = requireNotNull(cancelAfterValue) { "cancelAfter is required" }
      set(`value`) {
        cancelAfterValue = value
      }

    public fun build(): IssuingCardLifecycleControls {
      check(cancelAfterValue != null) { "cancelAfter is required" }
      return IssuingCardLifecycleControls(
        cancelAfter = cancelAfter,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardLifecycleControls = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingCardLifecycleControls> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardLifecycleControls {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardLifecycleControls")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardLifecycleControls must be a JSON object")
      val cancelAfter = json.decodeRequired<IssuingCardLifecycleConditions>(rawObject, "cancel_after")
      return IssuingCardLifecycleControls(
        cancelAfter = cancelAfter,
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardLifecycleControls) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardLifecycleControls")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cancel_after", json.encodeToJsonElement(value.cancelAfter))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardLifecycleControls(block: IssuingCardLifecycleControls.Builder.() -> Unit): IssuingCardLifecycleControls = IssuingCardLifecycleControls.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingCardLifecycleControls is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
