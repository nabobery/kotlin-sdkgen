package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/price_data/properties/product_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/price_data/properties/product_data
 */
@Serializable(with = InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf.Serializer::class)
public class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf(
  public val name: String,
  public val description: String? = null,
  images: List<String>? = null,
  metadata: Map<String, String>? = null,
  public val taxCode: String? = null,
  public val unitLabel: String? = null,
) {
  public val images: List<String>? = images?.let { collection0 -> collection0.toList() }

  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public var description: String? = null

    private var imagesValue: List<String>? = null

    public var images: List<String>?
      get() = imagesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        imagesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var taxCode: String? = null

    public var unitLabel: String? = null

    public fun build(): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf {
      check(nameValue != null) { "name is required" }
      return InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf(
        name = name,
        description = description,
        images = images,
        metadata = metadata,
        taxCode = taxCode,
        unitLabel = unitLabel,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf(
        name = name,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        images = rawObject["images"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        taxCode = rawObject["tax_code"]?.let { json.decodeFromJsonElement<String>(it) },
        unitLabel = rawObject["unit_label"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.description?.let { put("description", it) }
        value.images?.let { put("images", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.taxCode?.let { put("tax_code", it) }
        value.unitLabel?.let { put("unit_label", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf(block: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf.Builder.() -> Unit): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf = InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataProductDataXb15ffacf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
