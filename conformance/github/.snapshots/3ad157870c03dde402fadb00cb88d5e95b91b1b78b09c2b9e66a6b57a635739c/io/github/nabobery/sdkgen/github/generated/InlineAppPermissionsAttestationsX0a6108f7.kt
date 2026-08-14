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
 * The level of permission to create and retrieve the access token for repository attestations.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/attestations
 */
@Serializable(with = InlineAppPermissionsAttestationsX0a6108f7.Serializer::class)
public sealed class InlineAppPermissionsAttestationsX0a6108f7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsAttestationsX0a6108f7() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsAttestationsX0a6108f7() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsAttestationsX0a6108f7()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsAttestationsX0a6108f7 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsAttestationsX0a6108f7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsAttestationsX0a6108f7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsAttestationsX0a6108f7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsAttestationsX0a6108f7) {
      encoder.encodeString(value.value)
    }
  }
}
