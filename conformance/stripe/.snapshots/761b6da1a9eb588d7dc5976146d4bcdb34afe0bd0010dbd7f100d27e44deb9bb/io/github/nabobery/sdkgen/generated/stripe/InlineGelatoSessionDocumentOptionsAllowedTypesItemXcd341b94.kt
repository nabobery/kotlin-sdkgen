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
 * sdkgen://source/openapi.json#/components/schemas/gelato_session_document_options/properties/allowed_types/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/gelato_session_document_options/properties/allowed_types/items
 */
@Serializable(with = InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94.Serializer::class)
public sealed class InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `driving_license`.
   */
  public data object DrivingLicense : InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94() {
    public override val `value`: String = "driving_license"
  }

  /**
   * Documented value. Wire value: `id_card`.
   */
  public data object IdCard : InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94() {
    public override val `value`: String = "id_card"
  }

  /**
   * Documented value. Wire value: `passport`.
   */
  public data object Passport : InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94() {
    public override val `value`: String = "passport"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94 = when (value) {
      DrivingLicense.value -> DrivingLicense
      IdCard.value -> IdCard
      Passport.value -> Passport
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94) {
      encoder.encodeString(value.value)
    }
  }
}
