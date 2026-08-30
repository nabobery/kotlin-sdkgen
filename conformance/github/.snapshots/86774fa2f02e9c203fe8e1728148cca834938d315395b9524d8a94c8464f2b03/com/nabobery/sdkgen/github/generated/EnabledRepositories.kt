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
 * The policy that controls the repositories in the organization that are allowed to run GitHub Actions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/enabled-repositories
 */
@Serializable(with = EnabledRepositories.Serializer::class)
public sealed class EnabledRepositories {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : EnabledRepositories() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : EnabledRepositories() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : EnabledRepositories() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : EnabledRepositories()

  public companion object {
    public fun fromValue(`value`: String): EnabledRepositories = when (value) {
      All.value -> All
      None.value -> None
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<EnabledRepositories> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.EnabledRepositories", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): EnabledRepositories = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: EnabledRepositories) {
      encoder.encodeString(value.value)
    }
  }
}
