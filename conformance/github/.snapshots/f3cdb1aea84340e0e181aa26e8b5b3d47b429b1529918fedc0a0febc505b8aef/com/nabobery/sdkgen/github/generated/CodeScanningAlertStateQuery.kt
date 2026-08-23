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
 * State of a code scanning alert.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-state-query
 */
@Serializable(with = CodeScanningAlertStateQuery.Serializer::class)
public sealed class CodeScanningAlertStateQuery {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : CodeScanningAlertStateQuery() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : CodeScanningAlertStateQuery() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : CodeScanningAlertStateQuery() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : CodeScanningAlertStateQuery() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : CodeScanningAlertStateQuery()

  public companion object {
    public fun fromValue(`value`: String): CodeScanningAlertStateQuery = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Dismissed.value -> Dismissed
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<CodeScanningAlertStateQuery> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.CodeScanningAlertStateQuery", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): CodeScanningAlertStateQuery = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: CodeScanningAlertStateQuery) {
      encoder.encodeString(value.value)
    }
  }
}
