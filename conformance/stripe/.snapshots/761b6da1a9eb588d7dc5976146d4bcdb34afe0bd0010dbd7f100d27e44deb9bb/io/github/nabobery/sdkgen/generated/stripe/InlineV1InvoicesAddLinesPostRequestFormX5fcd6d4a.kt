package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a.Serializer::class)
public class InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a(
  lines: List<InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25>,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val invoiceMetadata:
      InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669? = null,
) {
  /**
   * The line items to add.
   */
  public val lines: List<InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25> = lines.toList()

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var linesValue: List<InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25>? = null

    public var lines: List<InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25>
      get() = requireNotNull(linesValue) { "lines is required" }.toList()
      set(`value`) {
        linesValue = value.toList()
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var invoiceMetadata: InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669? =
        null

    public fun build(): InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a {
      check(linesValue != null) { "lines is required" }
      return InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a(
        lines = lines,
        expand = expand,
        invoiceMetadata = invoiceMetadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a must be a JSON object")
      val lines = json.decodeRequired<List<InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25>>(rawObject, "lines")
      return InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a(
        lines = lines,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        invoiceMetadata = rawObject["invoice_metadata"]?.let { json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("lines", json.encodeToJsonElement(value.lines))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.invoiceMetadata?.let { put("invoice_metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a(block: InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a.Builder.() -> Unit): InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a = InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
