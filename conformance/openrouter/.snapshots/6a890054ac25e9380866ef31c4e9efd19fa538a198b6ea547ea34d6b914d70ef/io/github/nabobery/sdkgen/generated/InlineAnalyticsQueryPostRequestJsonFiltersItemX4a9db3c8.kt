package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/f
 * ilters/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/f
 * ilters/items
 */
@Serializable(with = InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8.Serializer::class)
public class InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8(
  /**
   * Dimension to filter on. Use the /meta endpoint for available dimensions.
   */
  public val `field`: String,
  /**
   * Filter operator
   */
  public val `operator`: String,
  /**
   * Filter value (scalar or array depending on operator). Several dimensions are enriched in responses (returned as
   * human-readable labels), but filters must use the underlying ID: `api_key_id` — numeric ID (from generation
   * metadata) or key hash (64-char hex from GET /api/v1/keys, resolved server-side); `user` — Clerk user ID (e.g.
   * "user_abc123"), not the display name; `workspace` — workspace UUID, not the workspace name; `app` — numeric app ID,
   * not the app title; `model` — permaslug (e.g. "openai/gpt-4o"), not the display name. Other dimensions (provider,
   * origin, country, etc.) are not enriched and accept the value as returned.
   */
  public val `value`: InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633,
) {
  public class Builder {
    private var fieldValue: String? = null

    public var `field`: String
      get() = requireNotNull(fieldValue) { "field is required" }
      set(`value`) {
        fieldValue = value
      }

    private var operatorValue: String? = null

    public var `operator`: String
      get() = requireNotNull(operatorValue) { "operator is required" }
      set(`value`) {
        operatorValue = value
      }

    private var valueValue: InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633? = null

    public var `value`: InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8 {
      check(fieldValue != null) { "field is required" }
      check(operatorValue != null) { "operator is required" }
      check(valueValue != null) { "value is required" }
      return InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8(
        field = field,
        operator = operator,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8 must be a JSON object")
      val field = json.decodeRequired<String>(rawObject, "field")
      val operator = json.decodeRequired<String>(rawObject, "operator")
      val value = json.decodeRequired<InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633>(rawObject, "value")
      return InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8(
        field = field,
        operator = operator,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("field", value.field)
        put("operator", value.operator)
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8(block: InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8.Builder.() -> Unit): InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8 = InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
