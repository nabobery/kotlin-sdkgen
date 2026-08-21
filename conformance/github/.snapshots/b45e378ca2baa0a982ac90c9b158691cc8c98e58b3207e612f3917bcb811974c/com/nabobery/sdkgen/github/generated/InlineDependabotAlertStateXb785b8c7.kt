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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert/properties/state
 */
@Serializable(with = InlineDependabotAlertStateXb785b8c7.Serializer::class)
public sealed class InlineDependabotAlertStateXb785b8c7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto_dismissed`.
   */
  public data object AutoDismissed : InlineDependabotAlertStateXb785b8c7() {
    public override val `value`: String = "auto_dismissed"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineDependabotAlertStateXb785b8c7() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineDependabotAlertStateXb785b8c7() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineDependabotAlertStateXb785b8c7() {
    public override val `value`: String = "open"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertStateXb785b8c7()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertStateXb785b8c7 = when (value) {
      AutoDismissed.value -> AutoDismissed
      Dismissed.value -> Dismissed
      Fixed.value -> Fixed
      Open.value -> Open
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependabotAlertStateXb785b8c7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDependabotAlertStateXb785b8c7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertStateXb785b8c7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertStateXb785b8c7) {
      encoder.encodeString(value.value)
    }
  }
}
