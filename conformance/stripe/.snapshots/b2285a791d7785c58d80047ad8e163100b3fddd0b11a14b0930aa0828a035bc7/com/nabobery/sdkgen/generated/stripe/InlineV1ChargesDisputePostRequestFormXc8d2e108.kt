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
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormXc8d2e108.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormXc8d2e108(
  /**
   * Evidence to upload, to respond to a dispute. Updating any field in the hash will submit all fields in the hash for
   * review. The combined character count of all fields is limited to 150,000.
   */
  public val evidence: InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1ChargesDisputePostRequestFormMetadataX7e319697? = null,
  /**
   * Whether to immediately submit evidence to the bank. If `false`, evidence is staged on the dispute. Staged evidence
   * is visible in the API and Dashboard, and can be submitted to the bank by making another request with this attribute
   * set to `true` (the default).
   */
  public val submit: Boolean? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Evidence to upload, to respond to a dispute. Updating any field in the hash will submit all fields in the hash
     * for review. The combined character count of all fields is limited to 150,000.
     */
    public var evidence: InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a? = null

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
    public var metadata: InlineV1ChargesDisputePostRequestFormMetadataX7e319697? = null

    /**
     * Whether to immediately submit evidence to the bank. If `false`, evidence is staged on the dispute. Staged
     * evidence is visible in the API and Dashboard, and can be submitted to the bank by making another request with
     * this attribute set to `true` (the default).
     */
    public var submit: Boolean? = null

    public fun build(): InlineV1ChargesDisputePostRequestFormXc8d2e108 = InlineV1ChargesDisputePostRequestFormXc8d2e108(
      evidence = evidence,
      expand = expand,
      metadata = metadata,
      submit = submit,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormXc8d2e108 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormXc8d2e108> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormXc8d2e108 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormXc8d2e108")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesDisputePostRequestFormXc8d2e108 must be a JSON object")
      return InlineV1ChargesDisputePostRequestFormXc8d2e108(
        evidence = rawObject["evidence"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormMetadataX7e319697>(it) },
        submit = rawObject["submit"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormXc8d2e108) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormXc8d2e108")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.evidence?.let { put("evidence", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.submit?.let { put("submit", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesDisputePostRequestFormXc8d2e108(block: InlineV1ChargesDisputePostRequestFormXc8d2e108.Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormXc8d2e108 = InlineV1ChargesDisputePostRequestFormXc8d2e108.build(block)
