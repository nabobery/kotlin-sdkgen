package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * A list of TransactionEntries that are part of this Transaction. This cannot be expanded in any list endpoints.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.transaction/properties/entries
 */
@Serializable(with = InlineTreasuryTransactionEntriesX6cf91389.Serializer::class)
public class InlineTreasuryTransactionEntriesX6cf91389(
  `data`: List<TreasuryTransactionEntry>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineTreasuryTransactionEntriesObjectValueXea010c31,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  /**
   * Details about each object.
   */
  public val `data`: List<TreasuryTransactionEntry> = data.toList()

  public class Builder {
    private var dataValue: List<TreasuryTransactionEntry>? = null

    public var `data`: List<TreasuryTransactionEntry>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var hasMoreValue: Boolean? = null

    public var hasMore: Boolean
      get() = requireNotNull(hasMoreValue) { "hasMore is required" }
      set(`value`) {
        hasMoreValue = value
      }

    private var objectValueValue: InlineTreasuryTransactionEntriesObjectValueXea010c31? = null

    public var objectValue: InlineTreasuryTransactionEntriesObjectValueXea010c31
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineTreasuryTransactionEntriesX6cf91389 {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineTreasuryTransactionEntriesX6cf91389(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTreasuryTransactionEntriesX6cf91389 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineTreasuryTransactionEntriesX6cf91389> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryTransactionEntriesX6cf91389 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryTransactionEntriesX6cf91389")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTreasuryTransactionEntriesX6cf91389 must be a JSON object")
      val data = json.decodeRequired<List<TreasuryTransactionEntry>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineTreasuryTransactionEntriesObjectValueXea010c31>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineTreasuryTransactionEntriesX6cf91389(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryTransactionEntriesX6cf91389) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTreasuryTransactionEntriesX6cf91389")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("has_more", json.encodeToJsonElement(value.hasMore))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTreasuryTransactionEntriesX6cf91389(block: InlineTreasuryTransactionEntriesX6cf91389.Builder.() -> Unit): InlineTreasuryTransactionEntriesX6cf91389 = InlineTreasuryTransactionEntriesX6cf91389.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTreasuryTransactionEntriesX6cf91389 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
