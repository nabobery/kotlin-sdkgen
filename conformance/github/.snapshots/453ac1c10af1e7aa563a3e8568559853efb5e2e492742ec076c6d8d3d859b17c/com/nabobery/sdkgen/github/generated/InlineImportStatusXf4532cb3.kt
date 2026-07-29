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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/import/properties/status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/import/properties/status
 */
@Serializable(with = InlineImportStatusXf4532cb3.Serializer::class)
public sealed class InlineImportStatusXf4532cb3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auth`.
   */
  public data object Auth : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "auth"
  }

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "error"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `detecting`.
   */
  public data object Detecting : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "detecting"
  }

  /**
   * Documented value. Wire value: `choose`.
   */
  public data object Choose : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "choose"
  }

  /**
   * Documented value. Wire value: `auth_failed`.
   */
  public data object AuthFailed : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "auth_failed"
  }

  /**
   * Documented value. Wire value: `importing`.
   */
  public data object Importing : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "importing"
  }

  /**
   * Documented value. Wire value: `mapping`.
   */
  public data object Mapping : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "mapping"
  }

  /**
   * Documented value. Wire value: `waiting_to_push`.
   */
  public data object WaitingToPush : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "waiting_to_push"
  }

  /**
   * Documented value. Wire value: `pushing`.
   */
  public data object Pushing : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "pushing"
  }

  /**
   * Documented value. Wire value: `complete`.
   */
  public data object Complete : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "complete"
  }

  /**
   * Documented value. Wire value: `setup`.
   */
  public data object Setup : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "setup"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "unknown"
  }

  /**
   * Documented value. Wire value: `detection_found_multiple`.
   */
  public data object DetectionFoundMultiple : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "detection_found_multiple"
  }

  /**
   * Documented value. Wire value: `detection_found_nothing`.
   */
  public data object DetectionFoundNothing : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "detection_found_nothing"
  }

  /**
   * Documented value. Wire value: `detection_needs_auth`.
   */
  public data object DetectionNeedsAuth : InlineImportStatusXf4532cb3() {
    public override val `value`: String = "detection_needs_auth"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImportStatusXf4532cb3()

  public companion object {
    public fun fromValue(`value`: String): InlineImportStatusXf4532cb3 = when (value) {
      Auth.value -> Auth
      Error.value -> Error
      None.value -> None
      Detecting.value -> Detecting
      Choose.value -> Choose
      AuthFailed.value -> AuthFailed
      Importing.value -> Importing
      Mapping.value -> Mapping
      WaitingToPush.value -> WaitingToPush
      Pushing.value -> Pushing
      Complete.value -> Complete
      Setup.value -> Setup
      Unknown.value -> Unknown
      DetectionFoundMultiple.value -> DetectionFoundMultiple
      DetectionFoundNothing.value -> DetectionFoundNothing
      DetectionNeedsAuth.value -> DetectionNeedsAuth
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineImportStatusXf4532cb3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineImportStatusXf4532cb3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImportStatusXf4532cb3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImportStatusXf4532cb3) {
      encoder.encodeString(value.value)
    }
  }
}
