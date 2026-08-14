package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The level of permission to grant the access token to manage the email addresses belonging to a user.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/email_addresses
 */
@Serializable(with = InlineAppPermissionsEmailAddressesX192ffbe2.Serializer::class)
public sealed class InlineAppPermissionsEmailAddressesX192ffbe2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsEmailAddressesX192ffbe2() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsEmailAddressesX192ffbe2() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsEmailAddressesX192ffbe2()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsEmailAddressesX192ffbe2 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsEmailAddressesX192ffbe2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsEmailAddressesX192ffbe2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsEmailAddressesX192ffbe2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsEmailAddressesX192ffbe2) {
      encoder.encodeString(value.value)
    }
  }
}
