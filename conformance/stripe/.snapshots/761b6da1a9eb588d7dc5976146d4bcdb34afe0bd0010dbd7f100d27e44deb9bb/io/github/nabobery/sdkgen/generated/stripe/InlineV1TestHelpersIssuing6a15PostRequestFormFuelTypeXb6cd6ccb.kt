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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1finalize_amount/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/fuel/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1finalize_amount/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/fuel/properties/type
 */
@Serializable(with = InlineV1TestHelpersIssuing6a15PostRequestFormFuelTypeXb6cd6ccb.Serializer::class)
public sealed class InlineV1TestHelpersIssuing6a15PostRequestFormFuelTypeXb6cd6ccb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `diesel`.
   */
  public data object Diesel : InlineV1TestHelpersIssuing6a15PostRequestFormFuelTypeXb6cd6ccb() {
    public override val `value`: String = "diesel"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineV1TestHelpersIssuing6a15PostRequestFormFuelTypeXb6cd6ccb() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `unleaded_plus`.
   */
  public data object UnleadedPlus : InlineV1TestHelpersIssuing6a15PostRequestFormFuelTypeXb6cd6ccb() {
    public override val `value`: String = "unleaded_plus"
  }

  /**
   * Documented value. Wire value: `unleaded_regular`.
   */
  public data object UnleadedRegular : InlineV1TestHelpersIssuing6a15PostRequestFormFuelTypeXb6cd6ccb() {
    public override val `value`: String = "unleaded_regular"
  }

  /**
   * Documented value. Wire value: `unleaded_super`.
   */
  public data object UnleadedSuper : InlineV1TestHelpersIssuing6a15PostRequestFormFuelTypeXb6cd6ccb() {
    public override val `value`: String = "unleaded_super"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuing6a15PostRequestFormFuelTypeXb6cd6ccb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuing6a15PostRequestFormFuelTypeXb6cd6ccb = when (value) {
      Diesel.value -> Diesel
      Other.value -> Other
      UnleadedPlus.value -> UnleadedPlus
      UnleadedRegular.value -> UnleadedRegular
      UnleadedSuper.value -> UnleadedSuper
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing6a15PostRequestFormFuelTypeXb6cd6ccb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing6a15PostRequestFormFuelTypeXb6cd6ccb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing6a15PostRequestFormFuelTypeXb6cd6ccb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing6a15PostRequestFormFuelTypeXb6cd6ccb) {
      encoder.encodeString(value.value)
    }
  }
}
