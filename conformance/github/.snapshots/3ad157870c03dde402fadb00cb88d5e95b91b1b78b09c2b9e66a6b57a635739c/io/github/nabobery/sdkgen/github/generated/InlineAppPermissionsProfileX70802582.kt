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
 * The level of permission to grant the access token to manage the profile settings belonging to a user.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/profile
 */
@Serializable(with = InlineAppPermissionsProfileX70802582.Serializer::class)
public sealed class InlineAppPermissionsProfileX70802582 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsProfileX70802582() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsProfileX70802582()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsProfileX70802582 = when (value) {
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsProfileX70802582> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsProfileX70802582", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsProfileX70802582 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsProfileX70802582) {
      encoder.encodeString(value.value)
    }
  }
}
