package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ComputerUseServerTool/properties/environment.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ComputerUseServerTool/properties/environment
 */
@Serializable(with = InlineComputerUseServerToolEnvironmentXb519cc33.Serializer::class)
public sealed class InlineComputerUseServerToolEnvironmentXb519cc33 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `windows`.
   */
  public data object Windows : InlineComputerUseServerToolEnvironmentXb519cc33() {
    public override val `value`: String = "windows"
  }

  /**
   * Documented value. Wire value: `mac`.
   */
  public data object Mac : InlineComputerUseServerToolEnvironmentXb519cc33() {
    public override val `value`: String = "mac"
  }

  /**
   * Documented value. Wire value: `linux`.
   */
  public data object Linux : InlineComputerUseServerToolEnvironmentXb519cc33() {
    public override val `value`: String = "linux"
  }

  /**
   * Documented value. Wire value: `ubuntu`.
   */
  public data object Ubuntu : InlineComputerUseServerToolEnvironmentXb519cc33() {
    public override val `value`: String = "ubuntu"
  }

  /**
   * Documented value. Wire value: `browser`.
   */
  public data object Browser : InlineComputerUseServerToolEnvironmentXb519cc33() {
    public override val `value`: String = "browser"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComputerUseServerToolEnvironmentXb519cc33()

  public companion object {
    public fun fromValue(`value`: String): InlineComputerUseServerToolEnvironmentXb519cc33 = when (value) {
      Windows.value -> Windows
      Mac.value -> Mac
      Linux.value -> Linux
      Ubuntu.value -> Ubuntu
      Browser.value -> Browser
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineComputerUseServerToolEnvironmentXb519cc33> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineComputerUseServerToolEnvironmentXb519cc33", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComputerUseServerToolEnvironmentXb519cc33 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComputerUseServerToolEnvironmentXb519cc33) {
      encoder.encodeString(value.value)
    }
  }
}
