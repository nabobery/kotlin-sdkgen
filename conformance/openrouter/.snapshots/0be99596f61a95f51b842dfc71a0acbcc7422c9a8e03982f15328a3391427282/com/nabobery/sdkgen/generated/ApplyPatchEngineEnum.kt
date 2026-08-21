package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Which apply_patch engine to use. "auto" (default) uses native passthrough when the endpoint advertises native
 * apply_patch support, otherwise falls back to OpenRouter's HITL validator. "native" forces native passthrough — when
 * the endpoint does not support native, the request falls back to HITL. "openrouter" always runs the HITL validator.
 * Native passthrough streams the diff incrementally via `apply_patch_call_operation_diff.delta` events; HITL buffers
 * the diff for atomic delivery as a single delta.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchEngineEnum
 */
@Serializable(with = ApplyPatchEngineEnum.Serializer::class)
public sealed class ApplyPatchEngineEnum {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : ApplyPatchEngineEnum() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `native`.
   */
  public data object Native : ApplyPatchEngineEnum() {
    public override val `value`: String = "native"
  }

  /**
   * Documented value. Wire value: `openrouter`.
   */
  public data object Openrouter : ApplyPatchEngineEnum() {
    public override val `value`: String = "openrouter"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ApplyPatchEngineEnum()

  public companion object {
    public fun fromValue(`value`: String): ApplyPatchEngineEnum = when (value) {
      Auto.value -> Auto
      Native.value -> Native
      Openrouter.value -> Openrouter
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ApplyPatchEngineEnum> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ApplyPatchEngineEnum", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ApplyPatchEngineEnum = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ApplyPatchEngineEnum) {
      encoder.encodeString(value.value)
    }
  }
}
