package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesResult/allOf/1/properties/usage/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesResult/allOf/1/properties/usage/allOf/1
 */
@Serializable(with = InlineMessagesResultAllOf2UsageAllOf2X123a0229.Serializer::class)
public class InlineMessagesResultAllOf2UsageAllOf2X123a0229(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val cost: Double? = null,
  public val costDetails: CostDetails? = null,
  public val isByok: Boolean? = null,
  iterations: List<AnthropicUsageIteration>? = null,
  public val serviceTier: String? = null,
  public val speed: AnthropicSpeed? = null,
) {
  public val iterations: List<AnthropicUsageIteration>? =
      iterations?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var cost: Double? = null

    public var costDetails: CostDetails? = null

    public var isByok: Boolean? = null

    private var iterationsValue: List<AnthropicUsageIteration>? = null

    public var iterations: List<AnthropicUsageIteration>?
      get() = iterationsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        iterationsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var serviceTier: String? = null

    public var speed: AnthropicSpeed? = null

    public fun build(): InlineMessagesResultAllOf2UsageAllOf2X123a0229 = InlineMessagesResultAllOf2UsageAllOf2X123a0229(
      cost = cost,
      costDetails = costDetails,
      isByok = isByok,
      iterations = iterations,
      serviceTier = serviceTier,
      speed = speed,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesResultAllOf2UsageAllOf2X123a0229 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesResultAllOf2UsageAllOf2X123a0229> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesResultAllOf2UsageAllOf2X123a0229 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesResultAllOf2UsageAllOf2X123a0229")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesResultAllOf2UsageAllOf2X123a0229 must be a JSON object")
      return InlineMessagesResultAllOf2UsageAllOf2X123a0229(
        cost = rawObject["cost"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        costDetails = rawObject["cost_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<CostDetails?>(element) },
        isByok = rawObject["is_byok"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        iterations = rawObject["iterations"]?.let { json.decodeFromJsonElement<List<AnthropicUsageIteration>>(it) },
        serviceTier = rawObject["service_tier"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        speed = rawObject["speed"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicSpeed?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesResultAllOf2UsageAllOf2X123a0229) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesResultAllOf2UsageAllOf2X123a0229")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cost?.let { put("cost", json.encodeToJsonElement(it)) }
        value.costDetails?.let { put("cost_details", json.encodeToJsonElement(it)) }
        value.isByok?.let { put("is_byok", json.encodeToJsonElement(it)) }
        value.iterations?.let { put("iterations", json.encodeToJsonElement(it)) }
        value.serviceTier?.let { put("service_tier", it) }
        value.speed?.let { put("speed", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesResultAllOf2UsageAllOf2X123a0229(block: InlineMessagesResultAllOf2UsageAllOf2X123a0229.Builder.() -> Unit): InlineMessagesResultAllOf2UsageAllOf2X123a0229 = InlineMessagesResultAllOf2UsageAllOf2X123a0229.build(block)
