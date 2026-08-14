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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/c
 * lassifier_filters/properties/filters/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/c
 * lassifier_filters/properties/filters/items
 */
@Serializable(with = InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4.Serializer::class)
public class InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4(
  /**
   * Classifier dimension name to filter on (snake_case identifier, e.g. "department", "work_type").
   */
  public val `field`: String,
  /**
   * Filter operator. Only equality/set operators are supported (eq, neq, in, not_in) — ordered comparisons are not
   * available because classification values are strings.
   */
  public val `operator`: String,
  /**
   * Filter value. Use a scalar (string or number) for eq/neq, or an array for in/not_in.
   */
  public val `value`: InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187,
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

    private var valueValue:
        InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187? = null

    public var `value`:
        InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4 {
      check(fieldValue != null) { "field is required" }
      check(operatorValue != null) { "operator is required" }
      check(valueValue != null) { "value is required" }
      return InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4(
        field = field,
        operator = operator,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4 must be a JSON object")
      val field = json.decodeRequired<String>(rawObject, "field")
      val operator = json.decodeRequired<String>(rawObject, "operator")
      val value = json.decodeRequired<InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187>(rawObject, "value")
      return InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4(
        field = field,
        operator = operator,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4")
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

public fun inlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4(block: InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4.Builder.() -> Unit): InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4 = InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemXd288d8d4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
