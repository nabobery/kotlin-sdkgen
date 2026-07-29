package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77.Serializer::class)
public class InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77(
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
  /**
   * A set of options for the session’s verification checks.
   */
  public val options: InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492? = null,
  /**
   * Details provided about the user being verified. These details may be shown to the user.
   */
  public val providedDetails:
      InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70? = null,
  /**
   * The type of [verification check](https://docs.stripe.com/identity/verification-checks) to be performed.
   */
  public val type: InlineV1IdentityVerificationSessionsPostRequestFormTypeX37feb123? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * A set of options for the session’s verification checks.
     */
    public var options: InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492? = null

    /**
     * Details provided about the user being verified. These details may be shown to the user.
     */
    public var providedDetails:
        InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70? = null

    /**
     * The type of [verification check](https://docs.stripe.com/identity/verification-checks) to be performed.
     */
    public var type: InlineV1IdentityVerificationSessionsPostRequestFormTypeX37feb123? = null

    public fun build(): InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77 = InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77(
      expand = expand,
      metadata = metadata,
      options = options,
      providedDetails = providedDetails,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77 must be a JSON object")
      return InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        options = rawObject["options"]?.let { json.decodeFromJsonElement<InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492>(it) },
        providedDetails = rawObject["provided_details"]?.let { json.decodeFromJsonElement<InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsXaeebff70>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1IdentityVerificationSessionsPostRequestFormTypeX37feb123>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
        value.providedDetails?.let { put("provided_details", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77(block: InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77.Builder.() -> Unit): InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77 = InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77.build(block)
