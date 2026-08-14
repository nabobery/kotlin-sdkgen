package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/tax_registrations.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/tax_registrations
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e(
  public val enabled: Boolean,
  public val features: JsonObject? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var features: JsonObject? = null

    public fun build(): InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e(
        enabled = enabled,
        features = features,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e(
        enabled = enabled,
        features = rawObject["features"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.features?.let { put("features", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e(block: InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e = InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
