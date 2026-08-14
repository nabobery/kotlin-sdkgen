package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/components/schemas/gelato_report_document_options/properties/allowed_types/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/gelato_report_document_options/properties/allowed_types/items
 */
@Serializable(with = InlineGelatoReportDocumentOptionsAllowedTypesItemXa20213d0.Serializer::class)
public sealed class InlineGelatoReportDocumentOptionsAllowedTypesItemXa20213d0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `driving_license`.
   */
  public data object DrivingLicense : InlineGelatoReportDocumentOptionsAllowedTypesItemXa20213d0() {
    public override val `value`: String = "driving_license"
  }

  /**
   * Documented value. Wire value: `id_card`.
   */
  public data object IdCard : InlineGelatoReportDocumentOptionsAllowedTypesItemXa20213d0() {
    public override val `value`: String = "id_card"
  }

  /**
   * Documented value. Wire value: `passport`.
   */
  public data object Passport : InlineGelatoReportDocumentOptionsAllowedTypesItemXa20213d0() {
    public override val `value`: String = "passport"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoReportDocumentOptionsAllowedTypesItemXa20213d0()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoReportDocumentOptionsAllowedTypesItemXa20213d0 = when (value) {
      DrivingLicense.value -> DrivingLicense
      IdCard.value -> IdCard
      Passport.value -> Passport
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoReportDocumentOptionsAllowedTypesItemXa20213d0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineGelatoReportDocumentOptionsAllowedTypesItemXa20213d0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoReportDocumentOptionsAllowedTypesItemXa20213d0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoReportDocumentOptionsAllowedTypesItemXa20213d0) {
      encoder.encodeString(value.value)
    }
  }
}
