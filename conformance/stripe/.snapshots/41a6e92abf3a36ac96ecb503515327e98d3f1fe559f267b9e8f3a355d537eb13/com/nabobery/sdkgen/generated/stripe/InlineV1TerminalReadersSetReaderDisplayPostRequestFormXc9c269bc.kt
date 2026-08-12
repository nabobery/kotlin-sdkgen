package com.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1set_reader_display/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1set_reader_display/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc.Serializer::class)
public class InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc(
  /**
   * Type of information to display. Only `cart` is currently supported.
   */
  public val type: InlineV1TerminalReadersSetReaderDisplayPostRequestFormTypeX7d3b2376,
  /**
   * Cart details to display on the reader screen, including line items, amounts, and currency.
   */
  public val cart: InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954? = null,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var typeValue: InlineV1TerminalReadersSetReaderDisplayPostRequestFormTypeX7d3b2376? =
        null

    public var type: InlineV1TerminalReadersSetReaderDisplayPostRequestFormTypeX7d3b2376
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Cart details to display on the reader screen, including line items, amounts, and currency.
     */
    public var cart: InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc {
      check(typeValue != null) { "type is required" }
      return InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc(
        type = type,
        cart = cart,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc must be a JSON object")
      val type = json.decodeRequired<InlineV1TerminalReadersSetReaderDisplayPostRequestFormTypeX7d3b2376>(rawObject, "type")
      return InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc(
        type = type,
        cart = rawObject["cart"]?.let { json.decodeFromJsonElement<InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.cart?.let { put("cart", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc(block: InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc.Builder.() -> Unit): InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc = InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
