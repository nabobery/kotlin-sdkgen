package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * The underlying cause of the Account becoming inactive.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_account_status_details_api_resource_active
 * _status_details/properties/cause
 */
@Serializable(with = InlineBankConnectionsResouef23CauseXa67bbdf9.Serializer::class)
public sealed class InlineBankConnectionsResouef23CauseXa67bbdf9 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `access_expired`.
     */
    public data object AccessExpired : InlineBankConnectionsResouef23CauseXa67bbdf9() {
        public override val `value`: String = "access_expired"
    }

    /**
     * Documented value. Wire value: `institution_requirement`.
     */
    public data object InstitutionRequirement : InlineBankConnectionsResouef23CauseXa67bbdf9() {
        public override val `value`: String = "institution_requirement"
    }

    /**
     * Documented value. Wire value: `unspecified`.
     */
    public data object Unspecified : InlineBankConnectionsResouef23CauseXa67bbdf9() {
        public override val `value`: String = "unspecified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineBankConnectionsResouef23CauseXa67bbdf9()

    public companion object {
        public fun fromValue(`value`: String): InlineBankConnectionsResouef23CauseXa67bbdf9 =
            when (value) {
                AccessExpired.value -> AccessExpired
                InstitutionRequirement.value -> InstitutionRequirement
                Unspecified.value -> Unspecified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineBankConnectionsResouef23CauseXa67bbdf9> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineBankConnectionsResouef23CauseXa67bbdf9",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineBankConnectionsResouef23CauseXa67bbdf9 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBankConnectionsResouef23CauseXa67bbdf9,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
