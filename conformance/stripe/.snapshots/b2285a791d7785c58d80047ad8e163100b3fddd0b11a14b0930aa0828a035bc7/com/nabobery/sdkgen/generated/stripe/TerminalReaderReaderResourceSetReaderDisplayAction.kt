package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Represents a reader action to set the reader display
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_set_reader_display_action
 */
@Serializable(with = TerminalReaderReaderResourceSetReaderDisplayAction.Serializer::class)
public class TerminalReaderReaderResourceSetReaderDisplayAction(
  /**
   * Type of information to be displayed by the reader. Only `cart` is currently supported.
   */
  public val type: InlineTerminalReaderReaderResourceSetReaderDisplayActionTypeXd0d02bb3,
  /**
   * Cart object to be displayed by the reader, including line items, amounts, and currency.
   */
  public val cart: InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8? = null,
) {
  public class Builder {
    private var typeValue: InlineTerminalReaderReaderResourceSetReaderDisplayActionTypeXd0d02bb3? =
        null

    public var type: InlineTerminalReaderReaderResourceSetReaderDisplayActionTypeXd0d02bb3
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Cart object to be displayed by the reader, including line items, amounts, and currency.
     */
    public var cart: InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8? = null

    public fun build(): TerminalReaderReaderResourceSetReaderDisplayAction {
      check(typeValue != null) { "type is required" }
      return TerminalReaderReaderResourceSetReaderDisplayAction(
        type = type,
        cart = cart,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceSetReaderDisplayAction = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalReaderReaderResourceSetReaderDisplayAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceSetReaderDisplayAction {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceSetReaderDisplayAction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceSetReaderDisplayAction must be a JSON object")
      val type = json.decodeRequired<InlineTerminalReaderReaderResourceSetReaderDisplayActionTypeXd0d02bb3>(rawObject, "type")
      return TerminalReaderReaderResourceSetReaderDisplayAction(
        type = type,
        cart = rawObject["cart"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceSetReaderDisplayAction) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceSetReaderDisplayAction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.cart?.let { put("cart", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceSetReaderDisplayAction(block: TerminalReaderReaderResourceSetReaderDisplayAction.Builder.() -> Unit): TerminalReaderReaderResourceSetReaderDisplayAction = TerminalReaderReaderResourceSetReaderDisplayAction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalReaderReaderResourceSetReaderDisplayAction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
