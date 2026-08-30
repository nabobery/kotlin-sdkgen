package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1file_links/post/requestBody/content/application~1x-www-form-urlencoded/sche
 * ma.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1file_links/post/requestBody/content/application~1x-www-form-urlencoded/sche
 * ma
 */
@Serializable(with = InlineV1FileLinksPostRequestFormXc54383d7.Serializer::class)
public class InlineV1FileLinksPostRequestFormXc54383d7(
  /**
   * The ID of the file. The file's `purpose` must be one of the following: `business_icon`, `business_logo`,
   * `customer_signature`, `dispute_evidence`, `finance_report_run`, `financial_account_statement`,
   * `identity_document_downloadable`, `issuing_regulatory_reporting`, `pci_document`, `selfie`,
   * `sigma_scheduled_query`, `tax_document_user_upload`, `terminal_android_apk`, or `terminal_reader_splashscreen`.
   */
  public val `file`: String,
  expand: List<String>? = null,
  /**
   * The link isn't usable after this future timestamp.
   */
  public val expiresAt: Int? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1FileLinksPostRequestFormMetadataXaddcdec0? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var fileValue: String? = null

    public var `file`: String
      get() = requireNotNull(fileValue) { "file is required" }
      set(`value`) {
        fileValue = value
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
     * The link isn't usable after this future timestamp.
     */
    public var expiresAt: Int? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1FileLinksPostRequestFormMetadataXaddcdec0? = null

    public fun build(): InlineV1FileLinksPostRequestFormXc54383d7 {
      check(fileValue != null) { "file is required" }
      return InlineV1FileLinksPostRequestFormXc54383d7(
        file = file,
        expand = expand,
        expiresAt = expiresAt,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1FileLinksPostRequestFormXc54383d7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1FileLinksPostRequestFormXc54383d7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1FileLinksPostRequestFormXc54383d7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1FileLinksPostRequestFormXc54383d7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1FileLinksPostRequestFormXc54383d7 must be a JSON object")
      val file = json.decodeRequired<String>(rawObject, "file")
      return InlineV1FileLinksPostRequestFormXc54383d7(
        file = file,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1FileLinksPostRequestFormMetadataXaddcdec0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1FileLinksPostRequestFormXc54383d7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1FileLinksPostRequestFormXc54383d7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("file", value.file)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1FileLinksPostRequestFormXc54383d7(block: InlineV1FileLinksPostRequestFormXc54383d7.Builder.() -> Unit): InlineV1FileLinksPostRequestFormXc54383d7 = InlineV1FileLinksPostRequestFormXc54383d7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1FileLinksPostRequestFormXc54383d7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
