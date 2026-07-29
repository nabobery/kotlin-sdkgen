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
 * External accounts (bank accounts and debit cards) currently attached to this account. External accounts are only
 * returned for requests where `controller[is_controller]` is true.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account/properties/external_accounts
 */
@Serializable(with = InlineAccountExternalAccountsXace51fb0.Serializer::class)
public class InlineAccountExternalAccountsXace51fb0(
  `data`: List<InlineAccountExternalAccountsDataItemXc342300c>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineAccountExternalAccountsObjectValueXc19f2a88,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  /**
   * The list contains all external accounts that have been attached to the Stripe account. These may be bank accounts
   * or cards.
   */
  public val `data`: List<InlineAccountExternalAccountsDataItemXc342300c> = data.toList()

  public class Builder {
    private var dataValue: List<InlineAccountExternalAccountsDataItemXc342300c>? = null

    public var `data`: List<InlineAccountExternalAccountsDataItemXc342300c>
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

    private var objectValueValue: InlineAccountExternalAccountsObjectValueXc19f2a88? = null

    public var objectValue: InlineAccountExternalAccountsObjectValueXc19f2a88
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

    public fun build(): InlineAccountExternalAccountsXace51fb0 {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineAccountExternalAccountsXace51fb0(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAccountExternalAccountsXace51fb0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAccountExternalAccountsXace51fb0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAccountExternalAccountsXace51fb0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAccountExternalAccountsXace51fb0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAccountExternalAccountsXace51fb0 must be a JSON object")
      val data = json.decodeRequired<List<InlineAccountExternalAccountsDataItemXc342300c>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineAccountExternalAccountsObjectValueXc19f2a88>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineAccountExternalAccountsXace51fb0(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAccountExternalAccountsXace51fb0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAccountExternalAccountsXace51fb0")
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

public fun inlineAccountExternalAccountsXace51fb0(block: InlineAccountExternalAccountsXace51fb0.Builder.() -> Unit): InlineAccountExternalAccountsXace51fb0 = InlineAccountExternalAccountsXace51fb0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAccountExternalAccountsXace51fb0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
