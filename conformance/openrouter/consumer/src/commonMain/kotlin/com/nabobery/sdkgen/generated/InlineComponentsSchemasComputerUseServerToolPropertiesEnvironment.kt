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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ComputerUseServerTool/properties/environment.
 */
@Serializable(with = InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment.Serializer::class)
public sealed class InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `windows`.
   */
  public data object Windows : InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment() {
    public override val `value`: String = "windows"
  }

  /**
   * Documented value. Wire value: `mac`.
   */
  public data object Mac : InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment() {
    public override val `value`: String = "mac"
  }

  /**
   * Documented value. Wire value: `linux`.
   */
  public data object Linux : InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment() {
    public override val `value`: String = "linux"
  }

  /**
   * Documented value. Wire value: `ubuntu`.
   */
  public data object Ubuntu : InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment() {
    public override val `value`: String = "ubuntu"
  }

  /**
   * Documented value. Wire value: `browser`.
   */
  public data object Browser : InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment() {
    public override val `value`: String = "browser"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment =
      when (value) {
      Windows.value -> Windows
      Mac.value -> Mac
      Linux.value -> Linux
      Ubuntu.value -> Ubuntu
      Browser.value -> Browser
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment) {
      encoder.encodeString(value.value)
    }
  }
}
