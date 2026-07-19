package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Unit
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/Usage/allOf/1.
 */
@Serializable(with = InlineComponentsSchemasUsageAllOf1.Serializer::class)
public class InlineComponentsSchemasUsageAllOf1(
  /**
   * Cost of the completion
   */
  public val cost: Double? = null,
  public val costDetails: InlineComponentsSchemasUsageAllOf1PropertiesCostDetails? = null,
  /**
   * Whether a request was made using a Bring Your Own Key configuration
   */
  public val isByok: Boolean? = null,
  public val serverToolUseDetails: ServerToolUseDetails? = null,
) {
  public class Builder {
    /**
     * Cost of the completion
     */
    public var cost: Double? = null

    public var costDetails: InlineComponentsSchemasUsageAllOf1PropertiesCostDetails? = null

    /**
     * Whether a request was made using a Bring Your Own Key configuration
     */
    public var isByok: Boolean? = null

    public var serverToolUseDetails: ServerToolUseDetails? = null

    public fun build(): InlineComponentsSchemasUsageAllOf1 = InlineComponentsSchemasUsageAllOf1(
      cost = cost,
      costDetails = costDetails,
      isByok = isByok,
      serverToolUseDetails = serverToolUseDetails,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasUsageAllOf1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasUsageAllOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasUsageAllOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasUsageAllOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasUsageAllOf1 must be a JSON object")
      return InlineComponentsSchemasUsageAllOf1(
        cost = raw["cost"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        costDetails = raw["cost_details"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasUsageAllOf1PropertiesCostDetails>(it) },
        isByok = raw["is_byok"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        serverToolUseDetails = raw["server_tool_use_details"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ServerToolUseDetails?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasUsageAllOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasUsageAllOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cost?.let { put("cost", json.encodeToJsonElement(it)) }
        value.costDetails?.let { put("cost_details", json.encodeToJsonElement(it)) }
        value.isByok?.let { put("is_byok", json.encodeToJsonElement(it)) }
        value.serverToolUseDetails?.let { put("server_tool_use_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasUsageAllOf1(block: InlineComponentsSchemasUsageAllOf1.Builder.() ->
  Unit): InlineComponentsSchemasUsageAllOf1 = InlineComponentsSchemasUsageAllOf1.build(block)
