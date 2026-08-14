package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Usage/allOf/1
 */
@Serializable(with = InlineUsageAllOf2X6607860c.Serializer::class)
public class InlineUsageAllOf2X6607860c(
  /**
   * Cost of the completion
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val cost: Double? = null,
  public val costDetails: InlineUsageAllOf2CostDetailsX08abd2be? = null,
  /**
   * Whether a request was made using a Bring Your Own Key configuration
   */
  public val isByok: Boolean? = null,
  public val serverToolUseDetails: ServerToolUseDetails? = null,
) {
  public class Builder {
    /**
     * Cost of the completion
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var cost: Double? = null

    public var costDetails: InlineUsageAllOf2CostDetailsX08abd2be? = null

    /**
     * Whether a request was made using a Bring Your Own Key configuration
     */
    public var isByok: Boolean? = null

    public var serverToolUseDetails: ServerToolUseDetails? = null

    public fun build(): InlineUsageAllOf2X6607860c = InlineUsageAllOf2X6607860c(
      cost = cost,
      costDetails = costDetails,
      isByok = isByok,
      serverToolUseDetails = serverToolUseDetails,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsageAllOf2X6607860c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsageAllOf2X6607860c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsageAllOf2X6607860c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsageAllOf2X6607860c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsageAllOf2X6607860c must be a JSON object")
      return InlineUsageAllOf2X6607860c(
        cost = rawObject["cost"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        costDetails = rawObject["cost_details"]?.let { json.decodeFromJsonElement<InlineUsageAllOf2CostDetailsX08abd2be>(it) },
        isByok = rawObject["is_byok"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        serverToolUseDetails = rawObject["server_tool_use_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ServerToolUseDetails?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsageAllOf2X6607860c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsageAllOf2X6607860c")
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

public fun inlineUsageAllOf2X6607860c(block: InlineUsageAllOf2X6607860c.Builder.() -> Unit): InlineUsageAllOf2X6607860c = InlineUsageAllOf2X6607860c.build(block)
