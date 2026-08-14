package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema
 */
@Serializable(with = InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda.Serializer::class)
public class InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda(
  /**
   * A string to reference this user. This can be a customer ID, a session ID, or similar, and can be used to reconcile
   * this verification with your internal systems.
   */
  public val clientReferenceId: String? = null,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
  /**
   * A set of options for the session’s verification checks.
   */
  public val options: InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707? = null,
  /**
   * Details provided about the user being verified. These details might be shown to the user.
   */
  public val providedDetails:
      InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0? = null,
  /**
   * Customer ID
   */
  public val relatedCustomer: String? = null,
  /**
   * The ID of the Account representing a customer.
   */
  public val relatedCustomerAccount: String? = null,
  /**
   * Tokens referencing a Person resource and its associated account.
   */
  public val relatedPerson:
      InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0? = null,
  /**
   * The URL that the user will be redirected to upon completing the verification flow.
   */
  public val returnUrl: String? = null,
  /**
   * The type of [verification check](https://docs.stripe.com/identity/verification-checks) to be performed. You must
   * provide a `type` if not passing `verification_flow`.
   */
  public val type: InlineV1IdentityVerificationSessionsPostRequestFormTypeX11225b46? = null,
  /**
   * The ID of a verification flow from the Dashboard. See https://docs.stripe.com/identity/verification-flows.
   */
  public val verificationFlow: String? = null,
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
    /**
     * A string to reference this user. This can be a customer ID, a session ID, or similar, and can be used to
     * reconcile this verification with your internal systems.
     */
    public var clientReferenceId: String? = null

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
    public var options: InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707? = null

    /**
     * Details provided about the user being verified. These details might be shown to the user.
     */
    public var providedDetails:
        InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0? = null

    /**
     * Customer ID
     */
    public var relatedCustomer: String? = null

    /**
     * The ID of the Account representing a customer.
     */
    public var relatedCustomerAccount: String? = null

    /**
     * Tokens referencing a Person resource and its associated account.
     */
    public var relatedPerson:
        InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0? = null

    /**
     * The URL that the user will be redirected to upon completing the verification flow.
     */
    public var returnUrl: String? = null

    /**
     * The type of [verification check](https://docs.stripe.com/identity/verification-checks) to be performed. You must
     * provide a `type` if not passing `verification_flow`.
     */
    public var type: InlineV1IdentityVerificationSessionsPostRequestFormTypeX11225b46? = null

    /**
     * The ID of a verification flow from the Dashboard. See https://docs.stripe.com/identity/verification-flows.
     */
    public var verificationFlow: String? = null

    public fun build(): InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda = InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda(
      clientReferenceId = clientReferenceId,
      expand = expand,
      metadata = metadata,
      options = options,
      providedDetails = providedDetails,
      relatedCustomer = relatedCustomer,
      relatedCustomerAccount = relatedCustomerAccount,
      relatedPerson = relatedPerson,
      returnUrl = returnUrl,
      type = type,
      verificationFlow = verificationFlow,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda must be a JSON object")
      return InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda(
        clientReferenceId = rawObject["client_reference_id"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        options = rawObject["options"]?.let { json.decodeFromJsonElement<InlineV1IdentityVerificationSessionsPostRequestFormOptionsX5cb43707>(it) },
        providedDetails = rawObject["provided_details"]?.let { json.decodeFromJsonElement<InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0>(it) },
        relatedCustomer = rawObject["related_customer"]?.let { json.decodeFromJsonElement<String>(it) },
        relatedCustomerAccount = rawObject["related_customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        relatedPerson = rawObject["related_person"]?.let { json.decodeFromJsonElement<InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0>(it) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1IdentityVerificationSessionsPostRequestFormTypeX11225b46>(it) },
        verificationFlow = rawObject["verification_flow"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.clientReferenceId?.let { put("client_reference_id", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
        value.providedDetails?.let { put("provided_details", json.encodeToJsonElement(it)) }
        value.relatedCustomer?.let { put("related_customer", it) }
        value.relatedCustomerAccount?.let { put("related_customer_account", it) }
        value.relatedPerson?.let { put("related_person", json.encodeToJsonElement(it)) }
        value.returnUrl?.let { put("return_url", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
        value.verificationFlow?.let { put("verification_flow", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda(block: InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda.Builder.() -> Unit): InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda = InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda.build(block)
