package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * A VerificationSession guides you through the process of collecting and verifying the identities
 * of your users. It contains details about the type of verification, such as what [verification
 * check](/docs/identity/verification-checks) to perform. Only create one VerificationSession for
 * each verification in your system.
 *
 * A VerificationSession transitions through [multiple
 * statuses](/docs/identity/how-sessions-work) throughout its lifetime as it progresses through
 * the verification flow. The VerificationSession contains the user's verified data after
 * verification checks are complete.
 *
 * Related guide: [The Verification Sessions API](https://docs.stripe.com/identity/verification-sessions)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/identity.verification_session
 */
@Serializable(with = IdentityVerificationSession.Serializer::class)
public class IdentityVerificationSession(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineIdentityVerificationSessionObjectValueX913fcef9,
  /**
   * Status of this VerificationSession. [Learn more about the lifecycle of
   * sessions](https://docs.stripe.com/identity/how-sessions-work).
   */
  public val status: InlineIdentityVerificationSessionStatusX3fc36178,
  /**
   * The type of [verification check](https://docs.stripe.com/identity/verification-checks) to be performed.
   */
  public val type: InlineIdentityVerificationSessionTypeXa9d242aa,
  /**
   * A string to reference this user. This can be a customer ID, a session ID, or similar, and can be used to reconcile
   * this verification with your internal systems.
   */
  public val clientReferenceId: String? = null,
  /**
   * The short-lived client secret used by Stripe.js to [show a verification
   * modal](https://docs.stripe.com/js/identity/modal) inside your app. This client secret expires after 24 hours and
   * can only be used once. Don’t store it, log it, embed it in a URL, or expose it to anyone other than the user. Make
   * sure that you have TLS enabled on any page that includes the client secret. Refer to our docs on [passing the
   * client secret to the frontend](https://docs.stripe.com/identity/verification-sessions#client-secret) to learn more.
   */
  public val clientSecret: String? = null,
  /**
   * If present, this property tells you the last error encountered when processing the verification.
   */
  public val lastError: InlineIdentityVerificationSessionLastErrorXbe973247? = null,
  /**
   * ID of the most recent VerificationReport. [Learn more about accessing detailed verification
   * results.](https://docs.stripe.com/identity/verification-sessions#results)
   */
  public val lastVerificationReport:
      InlineIdentityVerificationSessionLastVerificationReportX5959b875? = null,
  /**
   * A set of options for the session’s verification checks.
   */
  public val options: InlineIdentityVerificationSessionOptionsX8b054091? = null,
  /**
   * Details provided about the user being verified. These details may be shown to the user.
   */
  public val providedDetails: InlineIdentityVerificationSessionProvidedDetailsXa010c3d8? = null,
  /**
   * Redaction status of this VerificationSession. If the VerificationSession is not redacted, this field will be null.
   */
  public val redaction: InlineIdentityVerificationSessionRedactionXf0d957f7? = null,
  /**
   * Customer ID
   */
  public val relatedCustomer: String? = null,
  /**
   * The ID of the Account representing a customer.
   */
  public val relatedCustomerAccount: String? = null,
  public val relatedPerson: GelatoRelatedPerson? = null,
  /**
   * The short-lived URL that you use to redirect a user to Stripe to submit their identity information. This URL
   * expires after 48 hours and can only be used once. Don’t store it, log it, send it in emails or expose it to anyone
   * other than the user. Refer to our docs on [verifying identity
   * documents](https://docs.stripe.com/identity/verify-identity-documents?platform=web&type=redirect) to learn how to
   * redirect users to Stripe.
   */
  public val url: String? = null,
  /**
   * The configuration token of a verification flow from the dashboard.
   */
  public val verificationFlow: String? = null,
  /**
   * The user’s verified data.
   */
  public val verifiedOutputs: InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var objectValueValue: InlineIdentityVerificationSessionObjectValueX913fcef9? = null

    public var objectValue: InlineIdentityVerificationSessionObjectValueX913fcef9
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: InlineIdentityVerificationSessionStatusX3fc36178? = null

    public var status: InlineIdentityVerificationSessionStatusX3fc36178
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineIdentityVerificationSessionTypeXa9d242aa? = null

    public var type: InlineIdentityVerificationSessionTypeXa9d242aa
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * A string to reference this user. This can be a customer ID, a session ID, or similar, and can be used to
     * reconcile this verification with your internal systems.
     */
    public var clientReferenceId: String? = null

    /**
     * The short-lived client secret used by Stripe.js to [show a verification
     * modal](https://docs.stripe.com/js/identity/modal) inside your app. This client secret expires after 24 hours and
     * can only be used once. Don’t store it, log it, embed it in a URL, or expose it to anyone other than the user.
     * Make sure that you have TLS enabled on any page that includes the client secret. Refer to our docs on [passing
     * the client secret to the frontend](https://docs.stripe.com/identity/verification-sessions#client-secret) to learn
     * more.
     */
    public var clientSecret: String? = null

    /**
     * If present, this property tells you the last error encountered when processing the verification.
     */
    public var lastError: InlineIdentityVerificationSessionLastErrorXbe973247? = null

    /**
     * ID of the most recent VerificationReport. [Learn more about accessing detailed verification
     * results.](https://docs.stripe.com/identity/verification-sessions#results)
     */
    public var lastVerificationReport:
        InlineIdentityVerificationSessionLastVerificationReportX5959b875? = null

    /**
     * A set of options for the session’s verification checks.
     */
    public var options: InlineIdentityVerificationSessionOptionsX8b054091? = null

    /**
     * Details provided about the user being verified. These details may be shown to the user.
     */
    public var providedDetails: InlineIdentityVerificationSessionProvidedDetailsXa010c3d8? = null

    /**
     * Redaction status of this VerificationSession. If the VerificationSession is not redacted, this field will be
     * null.
     */
    public var redaction: InlineIdentityVerificationSessionRedactionXf0d957f7? = null

    /**
     * Customer ID
     */
    public var relatedCustomer: String? = null

    /**
     * The ID of the Account representing a customer.
     */
    public var relatedCustomerAccount: String? = null

    public var relatedPerson: GelatoRelatedPerson? = null

    /**
     * The short-lived URL that you use to redirect a user to Stripe to submit their identity information. This URL
     * expires after 48 hours and can only be used once. Don’t store it, log it, send it in emails or expose it to
     * anyone other than the user. Refer to our docs on [verifying identity
     * documents](https://docs.stripe.com/identity/verify-identity-documents?platform=web&type=redirect) to learn how to
     * redirect users to Stripe.
     */
    public var url: String? = null

    /**
     * The configuration token of a verification flow from the dashboard.
     */
    public var verificationFlow: String? = null

    /**
     * The user’s verified data.
     */
    public var verifiedOutputs: InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01? = null

    public fun build(): IdentityVerificationSession {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return IdentityVerificationSession(
        created = created,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        status = status,
        type = type,
        clientReferenceId = clientReferenceId,
        clientSecret = clientSecret,
        lastError = lastError,
        lastVerificationReport = lastVerificationReport,
        options = options,
        providedDetails = providedDetails,
        redaction = redaction,
        relatedCustomer = relatedCustomer,
        relatedCustomerAccount = relatedCustomerAccount,
        relatedPerson = relatedPerson,
        url = url,
        verificationFlow = verificationFlow,
        verifiedOutputs = verifiedOutputs,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IdentityVerificationSession = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IdentityVerificationSession> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IdentityVerificationSession {
      val jsonDecoder = decoder.requireJsonDecoder("IdentityVerificationSession")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IdentityVerificationSession must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineIdentityVerificationSessionObjectValueX913fcef9>(rawObject, "object")
      val status = json.decodeRequired<InlineIdentityVerificationSessionStatusX3fc36178>(rawObject, "status")
      val type = json.decodeRequired<InlineIdentityVerificationSessionTypeXa9d242aa>(rawObject, "type")
      return IdentityVerificationSession(
        created = created,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        status = status,
        type = type,
        clientReferenceId = rawObject["client_reference_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        clientSecret = rawObject["client_secret"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lastError = rawObject["last_error"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIdentityVerificationSessionLastErrorXbe973247?>(element) },
        lastVerificationReport = rawObject["last_verification_report"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIdentityVerificationSessionLastVerificationReportX5959b875?>(element) },
        options = rawObject["options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIdentityVerificationSessionOptionsX8b054091?>(element) },
        providedDetails = rawObject["provided_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIdentityVerificationSessionProvidedDetailsXa010c3d8?>(element) },
        redaction = rawObject["redaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIdentityVerificationSessionRedactionXf0d957f7?>(element) },
        relatedCustomer = rawObject["related_customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        relatedCustomerAccount = rawObject["related_customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        relatedPerson = rawObject["related_person"]?.let { json.decodeFromJsonElement<GelatoRelatedPerson>(it) },
        url = rawObject["url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        verificationFlow = rawObject["verification_flow"]?.let { json.decodeFromJsonElement<String>(it) },
        verifiedOutputs = rawObject["verified_outputs"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IdentityVerificationSession) {
      val jsonEncoder = encoder.requireJsonEncoder("IdentityVerificationSession")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.clientReferenceId?.let { put("client_reference_id", it) }
        value.clientSecret?.let { put("client_secret", it) }
        value.lastError?.let { put("last_error", json.encodeToJsonElement(it)) }
        value.lastVerificationReport?.let { put("last_verification_report", json.encodeToJsonElement(it)) }
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
        value.providedDetails?.let { put("provided_details", json.encodeToJsonElement(it)) }
        value.redaction?.let { put("redaction", json.encodeToJsonElement(it)) }
        value.relatedCustomer?.let { put("related_customer", it) }
        value.relatedCustomerAccount?.let { put("related_customer_account", it) }
        value.relatedPerson?.let { put("related_person", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
        value.verificationFlow?.let { put("verification_flow", it) }
        value.verifiedOutputs?.let { put("verified_outputs", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun identityVerificationSession(block: IdentityVerificationSession.Builder.() -> Unit): IdentityVerificationSession = IdentityVerificationSession.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IdentityVerificationSession is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
