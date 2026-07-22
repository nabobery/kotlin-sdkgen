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
 * The permissions policy that controls the actions and reusable workflows that are allowed to run.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/allowed-actions
 */
@Serializable(with = AllowedActions.Serializer::class)
public sealed class AllowedActions {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : AllowedActions() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `local_only`.
   */
  public data object LocalOnly : AllowedActions() {
    public override val `value`: String = "local_only"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : AllowedActions() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : AllowedActions()

  public companion object {
    public fun fromValue(`value`: String): AllowedActions = when (value) {
      All.value -> All
      LocalOnly.value -> LocalOnly
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<AllowedActions> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.AllowedActions", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): AllowedActions = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: AllowedActions) {
      encoder.encodeString(value.value)
    }
  }
}
