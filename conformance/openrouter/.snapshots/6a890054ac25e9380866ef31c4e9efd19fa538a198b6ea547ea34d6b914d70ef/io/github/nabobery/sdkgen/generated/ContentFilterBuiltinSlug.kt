package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The builtin filter identifier
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentFilterBuiltinSlug
 */
@Serializable(with = ContentFilterBuiltinSlug.Serializer::class)
public sealed class ContentFilterBuiltinSlug {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `email`.
   */
  public data object Email : ContentFilterBuiltinSlug() {
    public override val `value`: String = "email"
  }

  /**
   * Documented value. Wire value: `phone`.
   */
  public data object Phone : ContentFilterBuiltinSlug() {
    public override val `value`: String = "phone"
  }

  /**
   * Documented value. Wire value: `ssn`.
   */
  public data object Ssn : ContentFilterBuiltinSlug() {
    public override val `value`: String = "ssn"
  }

  /**
   * Documented value. Wire value: `credit-card`.
   */
  public data object CreditCard : ContentFilterBuiltinSlug() {
    public override val `value`: String = "credit-card"
  }

  /**
   * Documented value. Wire value: `ip-address`.
   */
  public data object IpAddress : ContentFilterBuiltinSlug() {
    public override val `value`: String = "ip-address"
  }

  /**
   * Documented value. Wire value: `person-name`.
   */
  public data object PersonName : ContentFilterBuiltinSlug() {
    public override val `value`: String = "person-name"
  }

  /**
   * Documented value. Wire value: `address`.
   */
  public data object Address : ContentFilterBuiltinSlug() {
    public override val `value`: String = "address"
  }

  /**
   * Documented value. Wire value: `regex-prompt-injection`.
   */
  public data object RegexPromptInjection : ContentFilterBuiltinSlug() {
    public override val `value`: String = "regex-prompt-injection"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ContentFilterBuiltinSlug()

  public companion object {
    public fun fromValue(`value`: String): ContentFilterBuiltinSlug = when (value) {
      Email.value -> Email
      Phone.value -> Phone
      Ssn.value -> Ssn
      CreditCard.value -> CreditCard
      IpAddress.value -> IpAddress
      PersonName.value -> PersonName
      Address.value -> Address
      RegexPromptInjection.value -> RegexPromptInjection
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ContentFilterBuiltinSlug> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.ContentFilterBuiltinSlug", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ContentFilterBuiltinSlug = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ContentFilterBuiltinSlug) {
      encoder.encodeString(value.value)
    }
  }
}
