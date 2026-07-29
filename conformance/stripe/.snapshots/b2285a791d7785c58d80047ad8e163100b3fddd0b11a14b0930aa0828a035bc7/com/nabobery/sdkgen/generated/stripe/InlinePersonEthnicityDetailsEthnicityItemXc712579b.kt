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
 * sdkgen://source/openapi.json#/components/schemas/person_ethnicity_details/properties/ethnicity/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person_ethnicity_details/properties/ethnicity/items
 */
@Serializable(with = InlinePersonEthnicityDetailsEthnicityItemXc712579b.Serializer::class)
public sealed class InlinePersonEthnicityDetailsEthnicityItemXc712579b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cuban`.
   */
  public data object Cuban : InlinePersonEthnicityDetailsEthnicityItemXc712579b() {
    public override val `value`: String = "cuban"
  }

  /**
   * Documented value. Wire value: `hispanic_or_latino`.
   */
  public data object HispanicOrLatino : InlinePersonEthnicityDetailsEthnicityItemXc712579b() {
    public override val `value`: String = "hispanic_or_latino"
  }

  /**
   * Documented value. Wire value: `mexican`.
   */
  public data object Mexican : InlinePersonEthnicityDetailsEthnicityItemXc712579b() {
    public override val `value`: String = "mexican"
  }

  /**
   * Documented value. Wire value: `not_hispanic_or_latino`.
   */
  public data object NotHispanicOrLatino : InlinePersonEthnicityDetailsEthnicityItemXc712579b() {
    public override val `value`: String = "not_hispanic_or_latino"
  }

  /**
   * Documented value. Wire value: `other_hispanic_or_latino`.
   */
  public data object OtherHispanicOrLatino : InlinePersonEthnicityDetailsEthnicityItemXc712579b() {
    public override val `value`: String = "other_hispanic_or_latino"
  }

  /**
   * Documented value. Wire value: `prefer_not_to_answer`.
   */
  public data object PreferNotToAnswer : InlinePersonEthnicityDetailsEthnicityItemXc712579b() {
    public override val `value`: String = "prefer_not_to_answer"
  }

  /**
   * Documented value. Wire value: `puerto_rican`.
   */
  public data object PuertoRican : InlinePersonEthnicityDetailsEthnicityItemXc712579b() {
    public override val `value`: String = "puerto_rican"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePersonEthnicityDetailsEthnicityItemXc712579b()

  public companion object {
    public fun fromValue(`value`: String): InlinePersonEthnicityDetailsEthnicityItemXc712579b = when (value) {
      Cuban.value -> Cuban
      HispanicOrLatino.value -> HispanicOrLatino
      Mexican.value -> Mexican
      NotHispanicOrLatino.value -> NotHispanicOrLatino
      OtherHispanicOrLatino.value -> OtherHispanicOrLatino
      PreferNotToAnswer.value -> PreferNotToAnswer
      PuertoRican.value -> PuertoRican
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePersonEthnicityDetailsEthnicityItemXc712579b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePersonEthnicityDetailsEthnicityItemXc712579b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePersonEthnicityDetailsEthnicityItemXc712579b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePersonEthnicityDetailsEthnicityItemXc712579b) {
      encoder.encodeString(value.value)
    }
  }
}
