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
 * One billable pricing line for an image provider.
 */
@Serializable(with = ImagePricingEntry.Serializer::class)
public class ImagePricingEntry(
  public val billable: InlineComponentsSchemasImagePricingEntryPropertiesBillable,
  public val costUsd: Double,
  public val unit: InlineComponentsSchemasImagePricingEntryPropertiesUnit,
  public val variant: String? = null,
) {
  public class Builder {
    private var billableValue: InlineComponentsSchemasImagePricingEntryPropertiesBillable? = null

    public var billable: InlineComponentsSchemasImagePricingEntryPropertiesBillable
      get() = requireNotNull(billableValue) { "billable is required" }
      set(`value`) {
        billableValue = value
      }

    private var costUsdValue: Double? = null

    public var costUsd: Double
      get() = requireNotNull(costUsdValue) { "costUsd is required" }
      set(`value`) {
        costUsdValue = value
      }

    private var unitValue: InlineComponentsSchemasImagePricingEntryPropertiesUnit? = null

    public var unit: InlineComponentsSchemasImagePricingEntryPropertiesUnit
      get() = requireNotNull(unitValue) { "unit is required" }
      set(`value`) {
        unitValue = value
      }

    public var variant: String? = null

    public fun build(): ImagePricingEntry {
      check(billableValue != null) { "billable is required" }
      check(costUsdValue != null) { "costUsd is required" }
      check(unitValue != null) { "unit is required" }
      return ImagePricingEntry(
        billable = billable,
        costUsd = costUsd,
        unit = unit,
        variant = variant,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImagePricingEntry = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ImagePricingEntry> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImagePricingEntry {
      val jsonDecoder = decoder.requireJsonDecoder("ImagePricingEntry")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ImagePricingEntry must be a JSON object")
      val billable = json.decodeRequired<InlineComponentsSchemasImagePricingEntryPropertiesBillable>(raw, "billable")
      val costUsd = json.decodeRequired<Double>(raw, "cost_usd")
      val unit = json.decodeRequired<InlineComponentsSchemasImagePricingEntryPropertiesUnit>(raw, "unit")
      return ImagePricingEntry(
        billable = billable,
        costUsd = costUsd,
        unit = unit,
        variant = raw["variant"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImagePricingEntry) {
      val jsonEncoder = encoder.requireJsonEncoder("ImagePricingEntry")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billable", json.encodeToJsonElement(value.billable))
        put("cost_usd", json.encodeToJsonElement(value.costUsd))
        put("unit", json.encodeToJsonElement(value.unit))
        value.variant?.let { put("variant", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imagePricingEntry(block: ImagePricingEntry.Builder.() -> Unit): ImagePricingEntry = ImagePricingEntry
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImagePricingEntry is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
