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
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/customer_sheet.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/customer_sheet
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9.Serializer::class)
public class InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9(
  public val enabled: Boolean,
  public val features:
      InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var features:
        InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b? = null

    public fun build(): InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9(
        enabled = enabled,
        features = features,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9(
        enabled = enabled,
        features = rawObject["features"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetFeaturesX65d7888b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.features?.let { put("features", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9(block: InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9.Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9 = InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
