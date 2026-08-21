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
 * A list of reversals that have been applied to the transfer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer/properties/reversals
 */
@Serializable(with = InlineTransferReversalsX26c635da.Serializer::class)
public class InlineTransferReversalsX26c635da(
  `data`: List<TransferReversal>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineTransferReversalsObjectValueXb7bd65a6,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  /**
   * Details about each object.
   */
  public val `data`: List<TransferReversal> = data.toList()

  public class Builder {
    private var dataValue: List<TransferReversal>? = null

    public var `data`: List<TransferReversal>
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

    private var objectValueValue: InlineTransferReversalsObjectValueXb7bd65a6? = null

    public var objectValue: InlineTransferReversalsObjectValueXb7bd65a6
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

    public fun build(): InlineTransferReversalsX26c635da {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineTransferReversalsX26c635da(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTransferReversalsX26c635da = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTransferReversalsX26c635da> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTransferReversalsX26c635da {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTransferReversalsX26c635da")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTransferReversalsX26c635da must be a JSON object")
      val data = json.decodeRequired<List<TransferReversal>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineTransferReversalsObjectValueXb7bd65a6>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineTransferReversalsX26c635da(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTransferReversalsX26c635da) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTransferReversalsX26c635da")
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

public fun inlineTransferReversalsX26c635da(block: InlineTransferReversalsX26c635da.Builder.() -> Unit): InlineTransferReversalsX26c635da = InlineTransferReversalsX26c635da.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTransferReversalsX26c635da is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
