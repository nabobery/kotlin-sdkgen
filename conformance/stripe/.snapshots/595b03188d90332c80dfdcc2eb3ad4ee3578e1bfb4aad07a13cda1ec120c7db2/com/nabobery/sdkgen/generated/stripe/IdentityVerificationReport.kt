package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

@Serializable
public data class IdentityVerificationReportView(
    @SerialName("client_reference_id")
    public val clientReferenceId: String? = null,
    public val created: Int,
    public val document: GelatoDocumentReport? = null,
    public val email: GelatoEmailReport? = null,
    public val id: String,
    @SerialName("id_number")
    public val idNumber: GelatoIdNumberReport? = null,
    public val livemode: Boolean,
    @SerialName("object")
    public val objectValue: InlineIdentityVerificationReportObjectValueXbd208f05,
    public val options: GelatoVerificationReportOptions? = null,
    public val phone: GelatoPhoneReport? = null,
    public val selfie: GelatoSelfieReport? = null,
    public val type: InlineIdentityVerificationReportTypeXbc510cff,
    @SerialName("verification_flow")
    public val verificationFlow: String? = null,
    @SerialName("verification_session")
    public val verificationSession: String? = null,
)

/**
 * A VerificationReport is the result of an attempt to collect and verify data from a user.
 * The collection of verification checks performed is determined from the `type` and `options`
 * parameters used. You can find the result of each verification check performed in the
 * appropriate sub-resource: `document`, `id_number`, `selfie`.
 *
 * Each VerificationReport contains a copy of any data collected by the user as well as
 * reference IDs which can be used to access collected images through the
 * [FileUpload](https://docs.stripe.com/api/files)
 * API. To configure and create VerificationReports, use the
 * [VerificationSession](https://docs.stripe.com/api/identity/verification_sessions) API.
 *
 * Related guide: [Accessing verification results](https://docs.stripe.com/identity/verification-sessions#results).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/identity.verification_report
 */
@Serializable(with = IdentityVerificationReport.Serializer::class)
public class IdentityVerificationReport(
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
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineIdentityVerificationReportObjectValueXbd208f05,
    /**
     * Type of report.
     */
    public val type: InlineIdentityVerificationReportTypeXbc510cff,
    /**
     * A string to reference this user. This can be a customer ID, a session ID, or similar, and can be used to reconcile
     * this verification with your internal systems.
     */
    public val clientReferenceId: String? = null,
    public val document: GelatoDocumentReport? = null,
    public val email: GelatoEmailReport? = null,
    public val idNumber: GelatoIdNumberReport? = null,
    public val options: GelatoVerificationReportOptions? = null,
    public val phone: GelatoPhoneReport? = null,
    public val selfie: GelatoSelfieReport? = null,
    /**
     * The configuration token of a verification flow from the dashboard.
     */
    public val verificationFlow: String? = null,
    /**
     * ID of the VerificationSession that created this report.
     */
    public val verificationSession: String? = null,
) {
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

        private var objectValueValue: InlineIdentityVerificationReportObjectValueXbd208f05? = null

        public var objectValue: InlineIdentityVerificationReportObjectValueXbd208f05
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var typeValue: InlineIdentityVerificationReportTypeXbc510cff? = null

        public var type: InlineIdentityVerificationReportTypeXbc510cff
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * A string to reference this user. This can be a customer ID, a session ID, or similar, and can be used to
         * reconcile this verification with your internal systems.
         */
        public var clientReferenceId: String? = null

        public var document: GelatoDocumentReport? = null

        public var email: GelatoEmailReport? = null

        public var idNumber: GelatoIdNumberReport? = null

        public var options: GelatoVerificationReportOptions? = null

        public var phone: GelatoPhoneReport? = null

        public var selfie: GelatoSelfieReport? = null

        /**
         * The configuration token of a verification flow from the dashboard.
         */
        public var verificationFlow: String? = null

        /**
         * ID of the VerificationSession that created this report.
         */
        public var verificationSession: String? = null

        public fun build(): IdentityVerificationReport {
            check(createdValue != null) { "created is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(typeValue != null) { "type is required" }
            return IdentityVerificationReport(
                created = created,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                type = type,
                clientReferenceId = clientReferenceId,
                document = document,
                email = email,
                idNumber = idNumber,
                options = options,
                phone = phone,
                selfie = selfie,
                verificationFlow = verificationFlow,
                verificationSession = verificationSession,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IdentityVerificationReport = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IdentityVerificationReport> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IdentityVerificationReport {
            val jsonDecoder = decoder.requireJsonDecoder("IdentityVerificationReport")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IdentityVerificationReport must be a JSON object")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue =
                json.decodeRequired<InlineIdentityVerificationReportObjectValueXbd208f05>(
                    rawObject,
                    "object",
                )
            val type = json.decodeRequired<InlineIdentityVerificationReportTypeXbc510cff>(rawObject, "type")
            return IdentityVerificationReport(
                created = created,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                type = type,
                clientReferenceId =
                    rawObject["client_reference_id"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                document = rawObject["document"]?.let { json.decodeFromJsonElement<GelatoDocumentReport>(it) },
                email = rawObject["email"]?.let { json.decodeFromJsonElement<GelatoEmailReport>(it) },
                idNumber = rawObject["id_number"]?.let { json.decodeFromJsonElement<GelatoIdNumberReport>(it) },
                options = rawObject["options"]?.let { json.decodeFromJsonElement<GelatoVerificationReportOptions>(it) },
                phone = rawObject["phone"]?.let { json.decodeFromJsonElement<GelatoPhoneReport>(it) },
                selfie = rawObject["selfie"]?.let { json.decodeFromJsonElement<GelatoSelfieReport>(it) },
                verificationFlow = rawObject["verification_flow"]?.let { json.decodeFromJsonElement<String>(it) },
                verificationSession =
                    rawObject["verification_session"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IdentityVerificationReport,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IdentityVerificationReport")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("created", json.encodeToJsonElement(value.created))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("type", json.encodeToJsonElement(value.type))
                    value.clientReferenceId?.let { put("client_reference_id", it) }
                    value.document?.let { put("document", json.encodeToJsonElement(it)) }
                    value.email?.let { put("email", json.encodeToJsonElement(it)) }
                    value.idNumber?.let { put("id_number", json.encodeToJsonElement(it)) }
                    value.options?.let { put("options", json.encodeToJsonElement(it)) }
                    value.phone?.let { put("phone", json.encodeToJsonElement(it)) }
                    value.selfie?.let { put("selfie", json.encodeToJsonElement(it)) }
                    value.verificationFlow?.let { put("verification_flow", it) }
                    value.verificationSession?.let { put("verification_session", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun identityVerificationReport(
    block: IdentityVerificationReport.Builder.() -> Unit,
): IdentityVerificationReport = IdentityVerificationReport.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("IdentityVerificationReport is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
