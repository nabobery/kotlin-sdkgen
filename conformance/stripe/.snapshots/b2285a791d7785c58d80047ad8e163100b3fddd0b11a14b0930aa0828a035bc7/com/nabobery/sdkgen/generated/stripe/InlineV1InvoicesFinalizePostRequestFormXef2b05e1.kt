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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1finalize/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1finalize/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema
 */
@Serializable(with = InlineV1InvoicesFinalizePostRequestFormXef2b05e1.Serializer::class)
public class InlineV1InvoicesFinalizePostRequestFormXef2b05e1(
  /**
   * Controls whether Stripe performs [automatic
   * collection](https://docs.stripe.com/invoicing/integration/automatic-advancement-collection) of the invoice. If
   * `false`, the invoice's state doesn't automatically advance without an explicit action.
   */
  public val autoAdvance: Boolean? = null,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Controls whether Stripe performs [automatic
     * collection](https://docs.stripe.com/invoicing/integration/automatic-advancement-collection) of the invoice. If
     * `false`, the invoice's state doesn't automatically advance without an explicit action.
     */
    public var autoAdvance: Boolean? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1InvoicesFinalizePostRequestFormXef2b05e1 = InlineV1InvoicesFinalizePostRequestFormXef2b05e1(
      autoAdvance = autoAdvance,
      expand = expand,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesFinalizePostRequestFormXef2b05e1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesFinalizePostRequestFormXef2b05e1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesFinalizePostRequestFormXef2b05e1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesFinalizePostRequestFormXef2b05e1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesFinalizePostRequestFormXef2b05e1 must be a JSON object")
      return InlineV1InvoicesFinalizePostRequestFormXef2b05e1(
        autoAdvance = rawObject["auto_advance"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesFinalizePostRequestFormXef2b05e1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesFinalizePostRequestFormXef2b05e1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.autoAdvance?.let { put("auto_advance", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesFinalizePostRequestFormXef2b05e1(block: InlineV1InvoicesFinalizePostRequestFormXef2b05e1.Builder.() -> Unit): InlineV1InvoicesFinalizePostRequestFormXef2b05e1 = InlineV1InvoicesFinalizePostRequestFormXef2b05e1.build(block)
