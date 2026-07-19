package com.nabobery.sdkgen.generated

import kotlin.Double
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
 * sdkgen://source/openapi.yaml#/paths/~1credits/get/responses/200/content/application~1json/schema/properties/data.
 */
@Serializable(with = InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData.Serializer::class)
public class InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData(
  /**
   * Total credits purchased
   */
  public val totalCredits: Double,
  /**
   * Total credits used
   */
  public val totalUsage: Double,
) {
  public class Builder {
    private var totalCreditsValue: Double? = null

    public var totalCredits: Double
      get() = requireNotNull(totalCreditsValue) { "totalCredits is required" }
      set(`value`) {
        totalCreditsValue = value
      }

    private var totalUsageValue: Double? = null

    public var totalUsage: Double
      get() = requireNotNull(totalUsageValue) { "totalUsage is required" }
      set(`value`) {
        totalUsageValue = value
      }

    public fun build(): InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData {
      check(totalCreditsValue != null) { "totalCredits is required" }
      check(totalUsageValue != null) { "totalUsage is required" }
      return InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData(
        totalCredits = totalCredits,
        totalUsage = totalUsage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData " +
          "must be a JSON object")
      val totalCredits = json.decodeRequired<Double>(raw, "total_credits")
      val totalUsage = json.decodeRequired<Double>(raw, "total_usage")
      return InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData(
        totalCredits = totalCredits,
        totalUsage = totalUsage,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_credits", json.encodeToJsonElement(value.totalCredits))
        put("total_usage", json.encodeToJsonElement(value.totalUsage))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData(block: InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData.Builder.() -> Unit): InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData = InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsCreditsGetResponses200ContentApplicationJsonSchemaPropertiesData is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
