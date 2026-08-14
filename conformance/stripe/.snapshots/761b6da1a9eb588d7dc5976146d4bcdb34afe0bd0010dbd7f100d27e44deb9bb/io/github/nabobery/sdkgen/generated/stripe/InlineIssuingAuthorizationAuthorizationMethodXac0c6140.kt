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
 * How the card details were provided.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.authorization/properties/authorization_method
 */
@Serializable(with = InlineIssuingAuthorizationAuthorizationMethodXac0c6140.Serializer::class)
public sealed class InlineIssuingAuthorizationAuthorizationMethodXac0c6140 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `chip`.
   */
  public data object Chip : InlineIssuingAuthorizationAuthorizationMethodXac0c6140() {
    public override val `value`: String = "chip"
  }

  /**
   * Documented value. Wire value: `contactless`.
   */
  public data object Contactless : InlineIssuingAuthorizationAuthorizationMethodXac0c6140() {
    public override val `value`: String = "contactless"
  }

  /**
   * Documented value. Wire value: `keyed_in`.
   */
  public data object KeyedIn : InlineIssuingAuthorizationAuthorizationMethodXac0c6140() {
    public override val `value`: String = "keyed_in"
  }

  /**
   * Documented value. Wire value: `online`.
   */
  public data object Online : InlineIssuingAuthorizationAuthorizationMethodXac0c6140() {
    public override val `value`: String = "online"
  }

  /**
   * Documented value. Wire value: `swipe`.
   */
  public data object Swipe : InlineIssuingAuthorizationAuthorizationMethodXac0c6140() {
    public override val `value`: String = "swipe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationAuthorizationMethodXac0c6140()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationAuthorizationMethodXac0c6140 = when (value) {
      Chip.value -> Chip
      Contactless.value -> Contactless
      KeyedIn.value -> KeyedIn
      Online.value -> Online
      Swipe.value -> Swipe
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationAuthorizationMethodXac0c6140> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationAuthorizationMethodXac0c6140", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationAuthorizationMethodXac0c6140 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationAuthorizationMethodXac0c6140) {
      encoder.encodeString(value.value)
    }
  }
}
