package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The state of the Dependabot alert.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-with-repository/properties/state
 */
@Serializable(with = InlineDependabotAlertWithRepositoryStateXca463581.Serializer::class)
public sealed class InlineDependabotAlertWithRepositoryStateXca463581 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto_dismissed`.
   */
  public data object AutoDismissed : InlineDependabotAlertWithRepositoryStateXca463581() {
    public override val `value`: String = "auto_dismissed"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineDependabotAlertWithRepositoryStateXca463581() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineDependabotAlertWithRepositoryStateXca463581() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineDependabotAlertWithRepositoryStateXca463581() {
    public override val `value`: String = "open"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertWithRepositoryStateXca463581()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertWithRepositoryStateXca463581 = when (value) {
      AutoDismissed.value -> AutoDismissed
      Dismissed.value -> Dismissed
      Fixed.value -> Fixed
      Open.value -> Open
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDependabotAlertWithRepositoryStateXca463581> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDependabotAlertWithRepositoryStateXca463581", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertWithRepositoryStateXca463581 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertWithRepositoryStateXca463581) {
      encoder.encodeString(value.value)
    }
  }
}
