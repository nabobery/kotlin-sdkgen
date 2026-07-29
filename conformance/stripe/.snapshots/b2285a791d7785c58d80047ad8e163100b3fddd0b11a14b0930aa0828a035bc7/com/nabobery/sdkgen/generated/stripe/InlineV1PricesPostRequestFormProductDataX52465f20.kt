package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
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
 * These fields can be used to create a new product that this price will belong to.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/product_data
 */
@Serializable(with = InlineV1PricesPostRequestFormProductDataX52465f20.Serializer::class)
public class InlineV1PricesPostRequestFormProductDataX52465f20(
  public val name: String,
  public val active: Boolean? = null,
  public val id: String? = null,
  metadata: Map<String, String>? = null,
  public val statementDescriptor: String? = null,
  public val taxCode: String? = null,
  public val unitLabel: String? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public var active: Boolean? = null

    public var id: String? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var statementDescriptor: String? = null

    public var taxCode: String? = null

    public var unitLabel: String? = null

    public fun build(): InlineV1PricesPostRequestFormProductDataX52465f20 {
      check(nameValue != null) { "name is required" }
      return InlineV1PricesPostRequestFormProductDataX52465f20(
        name = name,
        active = active,
        id = id,
        metadata = metadata,
        statementDescriptor = statementDescriptor,
        taxCode = taxCode,
        unitLabel = unitLabel,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PricesPostRequestFormProductDataX52465f20 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PricesPostRequestFormProductDataX52465f20> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormProductDataX52465f20 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesPostRequestFormProductDataX52465f20")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PricesPostRequestFormProductDataX52465f20 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1PricesPostRequestFormProductDataX52465f20(
        name = name,
        active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
        taxCode = rawObject["tax_code"]?.let { json.decodeFromJsonElement<String>(it) },
        unitLabel = rawObject["unit_label"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormProductDataX52465f20) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PricesPostRequestFormProductDataX52465f20")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.taxCode?.let { put("tax_code", it) }
        value.unitLabel?.let { put("unit_label", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PricesPostRequestFormProductDataX52465f20(block: InlineV1PricesPostRequestFormProductDataX52465f20.Builder.() -> Unit): InlineV1PricesPostRequestFormProductDataX52465f20 = InlineV1PricesPostRequestFormProductDataX52465f20.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PricesPostRequestFormProductDataX52465f20 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
