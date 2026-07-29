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
 * A classification of the file. For example to identify it as generated.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-classification
 */
@Serializable(with = CodeScanningAlertClassification.Serializer::class)
public sealed class CodeScanningAlertClassification {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `source`.
   */
  public data object Source : CodeScanningAlertClassification() {
    public override val `value`: String = "source"
  }

  /**
   * Documented value. Wire value: `generated`.
   */
  public data object Generated : CodeScanningAlertClassification() {
    public override val `value`: String = "generated"
  }

  /**
   * Documented value. Wire value: `test`.
   */
  public data object Test : CodeScanningAlertClassification() {
    public override val `value`: String = "test"
  }

  /**
   * Documented value. Wire value: `library`.
   */
  public data object Library : CodeScanningAlertClassification() {
    public override val `value`: String = "library"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : CodeScanningAlertClassification()

  public companion object {
    public fun fromValue(`value`: String): CodeScanningAlertClassification = when (value) {
      Source.value -> Source
      Generated.value -> Generated
      Test.value -> Test
      Library.value -> Library
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<CodeScanningAlertClassification> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.CodeScanningAlertClassification", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): CodeScanningAlertClassification = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: CodeScanningAlertClassification) {
      encoder.encodeString(value.value)
    }
  }
}
