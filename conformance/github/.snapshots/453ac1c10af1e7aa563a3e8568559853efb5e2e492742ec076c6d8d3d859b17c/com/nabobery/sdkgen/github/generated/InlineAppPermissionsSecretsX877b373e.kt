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
 * The level of permission to grant the access token to manage repository secrets.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/secrets
 */
@Serializable(with = InlineAppPermissionsSecretsX877b373e.Serializer::class)
public sealed class InlineAppPermissionsSecretsX877b373e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsSecretsX877b373e() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsSecretsX877b373e() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsSecretsX877b373e()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsSecretsX877b373e = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsSecretsX877b373e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsSecretsX877b373e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsSecretsX877b373e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsSecretsX877b373e) {
      encoder.encodeString(value.value)
    }
  }
}
