package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/options/properties/document/anyOf/0/properties/allowed_types/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/options/properties/document/anyOf/0/properties/allowed_types/items
 */
@Serializable(with = InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemX165d8da4.Serializer::class)
public sealed class InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemX165d8da4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `driving_license`.
   */
  public data object DrivingLicense : InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemX165d8da4() {
    public override val `value`: String = "driving_license"
  }

  /**
   * Documented value. Wire value: `id_card`.
   */
  public data object IdCard : InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemX165d8da4() {
    public override val `value`: String = "id_card"
  }

  /**
   * Documented value. Wire value: `passport`.
   */
  public data object Passport : InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemX165d8da4() {
    public override val `value`: String = "passport"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemX165d8da4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemX165d8da4 = when (value) {
      DrivingLicense.value -> DrivingLicense
      IdCard.value -> IdCard
      Passport.value -> Passport
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemX165d8da4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemX165d8da4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemX165d8da4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemX165d8da4) {
      encoder.encodeString(value.value)
    }
  }
}
